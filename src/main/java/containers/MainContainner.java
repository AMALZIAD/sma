package main.java.containers;
import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;


public class MainContainner {
    public static void main(String[] args) {
        try{
            Runtime runtime=Runtime.instance();
            Properties properties=new ExtendedProperties();
            properties.setProperty(Profile.GUI,"true");
            ProfileImpl profile=new ProfileImpl(properties);
            AgentContainer mainContainer=runtime.createMainContainer(profile);
            mainContainer.start();
        }
        catch(Exception e){ e.printStackTrace(); }
    }
}

