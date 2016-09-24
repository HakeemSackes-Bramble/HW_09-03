package nyc.c4q.hakeemsackesbramble;

import java.util.Scanner;

/**
 * Created by hakeemsackes-bramble on 8/29/16.
 */
public class TicTacToeGame {
    public static void main(String[] args) {

           ticTacToegame();
    }
    static boolean ticTacToegame() {
        String[] s = {" "," "," "," "," "," "," "," "," "};
        Scanner scan = new Scanner(System.in);
        int turnNumber = 0;
        String[] playerXO = {"X","O"};

        do {
            //start users turn
            TicTacToe_board.boardDisplay(s);
            int player = 0; //turn to 0 and implement TactfulTickPlayer to play computer
            System.out.println("\n\nTactfulTick: " + TactfulTickDialogue.braggingTick()+ "\n(Remember you are 'X')\n");
            System.out.print( "it's your turn, \nselect a number     |\nto choose a position: ");

            int position = GetUserPosition.getPosition();

            if (s[(position - 1)].equals(" ")) {
                s[(position - 1)] = playerXO[player];
                turnNumber += 1;
                player = turnNumber % 2;
                //after logging users turn, log computers turn
                TactfulTickPlayer.simplePlayer(playerXO[player],s);
                turnNumber += 1;
                //restart whole cycle
            } else {
                //if wrong input, output
                System.out.println(TactfulTickDialogue.trashTalkerTick() + "\n you cant go there!! pick another spot. \n\n Remember you are X");

            }

        }while (!Winner.isWinner(s) && turnNumber < 9);

        TicTacToe_board.boardDisplay(s);
        return Winner.isWinner(s);

        //I = 0 1 2
        //I * 2 + 2
        //r = 2 4 6

    }

}
