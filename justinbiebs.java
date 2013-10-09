
import com.echonest.api.v4.*;

import java.util.*;
public class ueoaa {
     public static void main(String[] args) throws EchoNestException {
            EchoNestAPI echoNest = new EchoNestAPI("Y1ATIPP12LOC2U2TV");
            echoNest.setTraceSends(true);
             Artist jb = echoNest.newArtistByName("Justin Bieber");
             List<News> news = jb.getNews(0, 5, true);
            if (news.size() > 0) {
                for (int i = 0; i< news.size(); i ++) {
                    
                    System.out.println(news.get(i).getName());
                    System.out.println(news.get(i).getSummary());
                    System.out.println();
                }
            }
        }
    
}
