package twitter4j;

import javax.swing.JOptionPane;
import twitter4j.*;

/**
 * Metodo que te permite buscar en todos los tuits recibidos una linea de texto
 * @author aquinoacordero
 */
public class BuscarPorHash {
    /**
     * 
     * @param twitter
     * @throws TwitterException 
     */
    
        public static void BuscarPorHash(Twitter twitter) throws TwitterException {
        String post = JOptionPane.showInputDialog(null, "Escribe lo que quieres buscar en twitter");
        Query query = new Query(post);
        QueryResult result = twitter.search(query);
        for (Status status : result.getTweets()) {
            System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
        }
    }
}
