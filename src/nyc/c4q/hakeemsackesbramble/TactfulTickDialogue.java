package nyc.c4q.hakeemsackesbramble;

import java.util.Random;

/**
 * Created by hakeemsackes-bramble on 9/1/16.
 */
public class TactfulTickDialogue {
    public static void main(String[] args) {
        braggingTick();
    }

    public static String braggingTick() {
        String[] monologue = {
                "im the greatest person to play the game!!",
                "no one has yet too best me!!",
                "bare witness to my omnipotence!!",
                "tons have trembled in attempt to take my throne!!",
                "I will never be defeated!!",
                "it's losers move!!",
                "take in the tactful ticks treachery!!",
                "your in time to be thrashed by the talented tactful tick!!",
                "its time to take you to town!!",
                "the ticks talent is tremendous!!"

        };
        Random text = new Random();
        int option = text.nextInt(monologue.length);
        return monologue[option];

    }

}
