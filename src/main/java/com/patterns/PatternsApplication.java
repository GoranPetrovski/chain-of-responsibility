package com.patterns;

import com.patterns.chan.responsibility.RequestHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.patterns.chan.responsibility.ChainOfResponsibilityClient.getHandlerChain;

@SpringBootApplication
public class PatternsApplication {

    public static void withoutComponents() {
        RequestHandler chain = getHandlerChain();

        String request = "We need aerial support!";
        System.out.println(request);
        chain.processRequest(request);

        request = "We're hungry!";
        System.out.println(request);
        chain.processRequest(request);

        request = "We're lost and confused!";
        System.out.println(request);
        chain.processRequest(request);
    }

    public static void main(String[] args) {
        SpringApplication.run(PatternsApplication.class, args);
        withoutComponents();
    }

}
