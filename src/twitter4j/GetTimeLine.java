package twitter4j;

import java.util.List;
import twitter4j.*;
/**
 * Metodo que genera los ultimos twits 
 * @author aquinoacordero
 */
public class GetTimeLine {
    /**
     * 
     * @param twitter
     * @throws TwitterException 
     */
    
     public static void GetTimeLine(Twitter twitter) throws TwitterException {
        List<Status> statuses = twitter.getHomeTimeline();
        System.out.println("Showing home timeline.");
        for (Status status : statuses) {
            System.out.println(status.getUser().getName() + ":"
                    + status.getText());
        }
    }
}
