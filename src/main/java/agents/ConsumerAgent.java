package main.java.agents;

import jade.core.Agent;

public class ConsumerAgent extends Agent {
    @Override
    protected void setup() {
        System.out.println("Initialisation Agent :"+this.getAID().getName());
    }
    @Override
    protected void beforeMove() {
        System.out.println("Before migration .....");
    }
    @Override
    protected void afterMove() {
        System.out.println("apres migration....");
    }
    @Override
    protected void takeDown() {
        System.out.println("befor dying :( .....");
    }
}
