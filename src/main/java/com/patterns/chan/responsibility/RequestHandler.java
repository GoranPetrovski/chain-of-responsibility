package com.patterns.chan.responsibility;

public interface RequestHandler {
    void processRequest(String request);
    void setNextHandler(RequestHandler handler);
}
