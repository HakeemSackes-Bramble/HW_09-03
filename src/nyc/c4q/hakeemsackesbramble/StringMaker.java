package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/30/16.
 */
public class StringMaker {
    public static void main(String[] args) {
   System.out.println(placeMaker());
   }
    public static String placeMaker(){

     String sentance = "";
     String[] place = { "a cave", "a tunnel", "an open field", "a swamp", "a trench", "an acquifer"};
     String[] wildlifeAbj = {"small","large","giant","tiny","glowing","slimy","prickly", "poisonous", "vibrant",
             "beutiful"};
     String[] nounSurround ={"trees", "river","boulders", "algae", "rocks", };
     String[] movement = {""};
     String[] adverbs = {"swiftly","cautiously","quietly","fearfully","boldly","strategically","","","",};
             String[] color = {"red","orange","green","blue","brown","pale white","purple",""};
       String[] plantsAnimals = {"worms","bats","wolves","fungi","spiders","mosses","bears","squirrels","alligators",""};
       String sentance1 = "you enter " + word(place) + " with "+ word(wildlifeAbj)+" " word(nounSurround)"+ " and "+"*3.";
       String sentance2 = "you  _adverb_ as the _place_ is covered with _size_ _color_ _plantsanimals_ is";
       String roomstory = sentance1 + sentance2;
       return roomstory;
   }

private static int israndon(int s){
return (int) (Math.random() * s);
}
private static String word(String[] words){
return words[israndon(words.length)];
}
}

