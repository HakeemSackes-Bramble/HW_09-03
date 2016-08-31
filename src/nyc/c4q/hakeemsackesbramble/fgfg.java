package nyc.c4q.hakeemsackesbramble;
import java.util.*;
/**
 * Created by hakeemsackes-bramble on 8/29/16.
 */
public class fgfg {


    public static void main(String[] args) {
            System.out.println("hello world");
            System.out.println(drawTriangle(5));
            hashTweets("dahvfkl vsjlkh dshdl #slbns @bsnjklvn vndfi#vfdvns");
    }

    public static String drawTriangle(int sizetri){
        String tri = "";
        for(int i =0; i <= sizetri; i++){
            tri += "\n";
            for(int j =0; j < i; j++){
                tri += "#";
            }
        }
            return tri;
    }


    public static void hashTweets(String tweet){
        String[] tweetlist = tweet.split(" ");
        String hash = "";
        String mentions ="";
        for (int i = 0; i < tweetlist.length; i++) {
            boolean isHash = (tweetlist[i].charAt(0) == '#');
            boolean isMention = (tweetlist[i].charAt(0) == '@');
            if (isHash) {
                hash += (tweetlist[i]) + " ";
            }
            if (isMention) {
                mentions += ((tweetlist[i]) + " ");
            }
        }
        System.out.print("hashtags: " + hash);
        System.out.println(" mentions: " + mentions);
    }

}

