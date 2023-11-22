package com.patterns.chan.responsibility;

public class AerialSupportRequestHandler extends AbstractRequestHandler {
    protected String[] wordList() {
        return new String[]{"bombing", "aerial"};
    }
    protected void handleRequest(String request) {
        System.out.println("Request handled by aerial support.");
    }
}
