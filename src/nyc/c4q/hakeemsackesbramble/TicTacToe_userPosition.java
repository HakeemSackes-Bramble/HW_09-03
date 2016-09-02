package nyc.c4q.hakeemsackesbramble;

import java.util.Scanner;

/**
 * Created by hakeemsackes-bramble on 8/29/16.
 */
public class TicTacToe_userPosition {
    public static void main(String[] args) {

           getTicTacToeWinner();
    }
    static boolean getTicTacToeWinner() {
        String[] s = {" "," "," "," "," "," "," "," "," "};
        Scanner scan = new Scanner(System.in);
        int turnNumber = 0;
        String[] playerXO = {"X","O"};

        while (!Winner.isWinner(s)) {
            //start users turn
            TicTacToe_board.boardDisplay(s);
            int player = 0; //turn to 0 and implement TactfulTickPlayer to play computer
            System.out.println( "it's your turn, select a number to choose a position");
            System.out.println("\nTactfulTick: " + TactfulTickDialogue.braggingTick());
            int position = scan.nextInt();
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
                System.out.println("You pea brained giant!! you cant go there!! pick another spot");

            }

        }

        TicTacToe_board.boardDisplay(s);
        return Winner.isWinner(s);

        //I = 0 1 2
        //I * 2 + 2
        //r = 2 4 6

    }

}
