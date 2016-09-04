package nyc.c4q.hakeemsackesbramble;

import java.util.Scanner;

/**
 * Created by hakeemsackes-bramble on 9/2/16.
 */
public class GetUserPosition {
    public static void main(String[] args) {

    }
    public static int getPosition(){

        Scanner scan = new Scanner(System.in);


        int placement = 99;
        while(!(placement > 0 && placement < 10)) {
            String position = scan.next();
            for (int i = 1; i < 10; i++) {
                if (position.equals("" + i)) {
                    placement = i;
                }
            }
            if (!(placement > 0 && placement < 10)) {
                System.out.println("\nTactful Tick: " + "WHAT ARE YOU DOING!!! "
                        + TactfulTickDialogue.trashTalkerTick() +
                        "\nPick a number to choose spot. " +
                        "\n\n Remember you are X");

            }

        }
        return placement;
    }


}


