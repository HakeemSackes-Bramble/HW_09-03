package nyc.c4q.hakeemsackesbramble;

import java.util.Random;

/**
 * Created by hakeemsackes-bramble on 9/1/16.
 */
public class TactfulTickDialogue {
    public static void main(String[] args) {
        braggingTick();
    }

    static String braggingTick() {
        String[] monologue = {
                "I am the greatest person to play the game!!",
                "No one has yet too best me!!",
                "Bare witness to my omnipotence!!",
                "Tons have trembled in attempt to take my throne!!",
                "I will never be defeated!!",
                "It's losers move!!",
                "Take in the tactful ticks treachery!!",
                "Your in time to be thrashed by the talented tactful tick!!",
                "Its time to take you down!!",
                "The ticks talent is tremendous!!"
        };
        Random text = new Random();
        int option = text.nextInt(monologue.length);
        return monologue[option];
    }


    static String trashTalkerTick(){
        String[] trashTalk = {
            "I can tell you are going to lose",
            "your really not that good are you?",
            "you know your not making sense.. right??",
            "just pick a number!!",
            "I've seen some very dull tools made of very dense materials, But your head my friend, is a lead ball",
            "oh my gosh!!! when will I ever find a worthy tic tac toe opponent"
        };


        Random text = new Random();
        int option = text.nextInt(trashTalk.length);
        return trashTalk[option];
    }

}
