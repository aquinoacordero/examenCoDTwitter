package twitter4j;

import java.util.logging.Level;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author aquinoacordero
 */

public class Twitter4J {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Logger.getLogger(TwitterSimulacion.class.getName()).log(Level.SEVERE, null, ex);
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        Twitter twitter = new TwitterFactory(cb.build()).getInstance();
        PostTwitter tuitear=new PostTwitter();
        GetTimeLine timeline=new GetTimeLine();
        BuscarPorHash buscartuit=new BuscarPorHash();
    }
    }
    

