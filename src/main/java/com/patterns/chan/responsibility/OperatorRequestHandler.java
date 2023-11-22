package com.patterns.chan.responsibility;

public class OperatorRequestHandler extends AbstractRequestHandler {
    protected String[] wordList() {
        return new String[0]; // match anything
    }
    protected void handleRequest(String request) {
        System.out.println("Request handled by operator.");
    }
}
