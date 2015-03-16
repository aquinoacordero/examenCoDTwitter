package twitter4j;

import javax.swing.JOptionPane;
import twitter4j.*;

/**
 * Metodo que permite postear un tuit propio
 * @author aquinoacordero
 */
public class PostTwitter {
        /**
         * 
         * @param twitter
         * @throws TwitterException 
         */    
    
       public static void PostTwitter(Twitter twitter) throws TwitterException {
        String post = JOptionPane.showInputDialog(null, "Escribe lo que quieres postear a twitter");
        Status status = twitter.updateStatus(post);
        System.out.println("actualizado correctamente el estado a [" + status.getText() + "].");
    }
}
