package main.java.containers;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;


public class SimpleContainner {
    public static void main(String[] args) {
        try{
            Runtime runtime=Runtime.instance();
            Properties properties=new ExtendedProperties();
            properties.setProperty(Profile.MAIN_HOST,"localhost");
            ProfileImpl profile=new ProfileImpl(properties);
            AgentContainer container=runtime.createAgentContainer(profile);
            container.start();
        }
        catch(Exception e){ e.printStackTrace(); }
    }
}

