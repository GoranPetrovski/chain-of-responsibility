package com.patterns.chan.responsibility;

public class ChainOfResponsibilityClient {
    public static RequestHandler getHandlerChain(){

        // Create the handlers
        RequestHandler food = new FoodRequestHandler();
        RequestHandler medic = new MedicRequestHandler();
        RequestHandler evac = new EvacuationRequestHandler();
        RequestHandler aerial = new AerialSupportRequestHandler();
        RequestHandler operator = new OperatorRequestHandler();

        // Chain them together
        food.setNextHandler(medic);
        medic.setNextHandler(evac);
        evac.setNextHandler(aerial);
        aerial.setNextHandler(operator);

        return food; // Start of the handler chain
    }
}
