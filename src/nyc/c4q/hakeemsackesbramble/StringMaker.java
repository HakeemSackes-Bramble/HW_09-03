package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/30/16.
 */
public class StringMaker {
    public static void main(String[] args) {
   placeMaker(20);
   }
    public static void placeMaker(int a){
        //wondering wombat


        String sentance = "";
        String[] place = { "a cave", "a tunnel", "an open field", "a swamp", "a trench", "an acquifer"};
        String[] wildlifeAbj = {"glowing","slimy","prickly", "poisonous", "vibrant", "moldy",
             "beautiful", "dangerous", "foul smelling"};
        String[] nounSurround ={"trees", "streams of water","boulders", "algae", "crystals", "leaves", "vines", "black pitch", "lava streams",""};
        String[] movement = {"walk", "run","crawl","sprint", "tip toe"};
        String[] adverbs = {"swiftly","cautiously","quietly","fearfully","boldly","strategically"};
        String[] color = {"fred","orange","sticky green","blue","brown","pale white"," purple"};
        String[] plantsAnimals = {"worms","bats","wolves","fungi","spiders","mosses","bears","squirrels","alligators",""};

       // for (int i = 0; i < a; i++) {
        /*
        Sample sentance:
        you enter through an enchanted opening and encounter a vast open cave with deep dark trenches. you walk cautiously so you can avoid the giant blue poison vines.
        while walking across the open cave you come across three doors
        */
            String sentance1 = " you enter the enchanted opening and  " + word(place) + " with " + word(wildlifeAbj) + " "
                    + word(nounSurround) + ", " + word(wildlifeAbj) + " " + word(nounSurround) + ", and " + word(wildlifeAbj)
                    + " " + word(nounSurround) + ". ";
            String sentance2 = "you " + word(movement) + " " + word(adverbs) + " through the " + word(wildlifeAbj) + " "
                    + word(color) + word(plantsAnimals) + " ";
            String roomstory = sentance1 + sentance2;
            System.out.println(roomstory + "\n");
        //}
   }

private static int israndon(int s){
return (int) (Math.random() * s);
}
private static String word(String[] words){
return words[israndon(words.length)];
}
}

