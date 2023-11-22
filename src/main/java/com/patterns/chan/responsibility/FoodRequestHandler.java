package com.patterns.chan.responsibility;

public class FoodRequestHandler extends AbstractRequestHandler {
    protected String[] wordList() {
        return new String[]{"food", "water", "rations", "hungry"};
    }
    protected void handleRequest(String request) {
        System.out.println("Request handled by kitchen.");
    }
}
