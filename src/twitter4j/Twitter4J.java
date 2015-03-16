package twitter4j;

import java.util.logging.Level;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.*;
import static twitter4j.BuscarPorHash.BuscarPorHash;
import static twitter4j.GetTimeLine.GetTimeLine;
import static twitter4j.PostTwitter.PostTwitter;

/**
 *
 * @author aquinoacordero
 * @version 1.0.0
 * @since 
 * 
 */

public class Twitter4J {

    /**
     * Metodo principal que llama al los metodos postear, timeline y buscartuit
     * @param args the command line arguments
     * 
     */
    
    public static void main(String[] args) throws TwitterException {
        //Logger.getLogger(TwitterSimulacion.class.getName()).log(Level.SEVERE, null, ex);
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        Twitter twitter = new TwitterFactory(cb.build()).getInstance();
        PostTwitter tuitear=new PostTwitter();
        GetTimeLine timeline=new GetTimeLine();
        BuscarPorHash buscartuit=new BuscarPorHash();
        PostTwitter(twitter);
        GetTimeLine(twitter);
        BuscarPorHash(twitter);
    }
    }
    

