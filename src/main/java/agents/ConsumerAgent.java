package main.java.agents;

import jade.core.Agent;

public class ConsumerAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("Initialisation Agent :"+this.getAID().getName());
    }
    @Override
    protected void beforeMove() {
        System.out.println("Avant de migrer vers une nouvelle location .....");
    }
    @Override
    protected void afterMove() {
        System.out.println("Je viens d'arriver à une nouvelle location .....");
    }
    @Override
    protected void takeDown() {
        System.out.println("avant de mourir .....");
    }
}
