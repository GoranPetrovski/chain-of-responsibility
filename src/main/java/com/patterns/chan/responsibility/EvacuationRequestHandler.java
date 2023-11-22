package com.patterns.chan.responsibility;

public class EvacuationRequestHandler extends AbstractRequestHandler {
    protected String[] wordList() {
        return new String[]{"evac", "evacuation"};
    }
    protected void handleRequest(String request) {
        System.out.println("Request handled by evacuations.");
    }

}
