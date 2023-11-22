package com.patterns.chan.responsibility;

public class MedicRequestHandler extends AbstractRequestHandler {
    protected String[] wordList() {
        return new String[]{"medic", "medicine", "doctor"};
    }
    protected void handleRequest(String request) {
        System.out.println("Request handled by medical department.");
    }

}
