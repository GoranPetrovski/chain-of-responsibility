package com.patterns.chan.responsibility;

public abstract class AbstractRequestHandler implements RequestHandler {

    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void processRequest(String request) {
        boolean match = false;
        // Handle the request here if the word list is empty
        if (wordList().length == 0) {
            match = true;
        } else {
            // Search for any of the keywords
            for (String word : wordList()) {
                if (request.contains(word)) {
                    match = true;
                    break;
                }
            }
        }
        // Can we handle the request here?
        if (match) {
            handleRequest(request);
        } else {
            // No match so pass the request along the chain
            System.out.println(nextHandler.getClass());
            nextHandler.processRequest(request);
        }
    }

    // to be implemented by the concrete handler subclasses
    protected abstract String[] wordList();
    protected abstract void handleRequest(String request);
}
