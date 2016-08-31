package nyc.c4q.hakeemsackesbramble;

import java.util.Scanner;

/**
 * Created by hakeemsackes-bramble on 8/29/16.
 */
public class TicTacToe_userPosition {
    public static void main(String[] args) {

           logPosition();
    }
    static boolean logPosition() {
        String[] s = {" "," "," "," "," "," "," "," "," "};
        Scanner scan = new Scanner(System.in);

        int turnNumber = 0;

        int player = 0;
        String[] playerXO = {"X","O"};
        while ((turnNumber < 10) && !Winner.isWinner(s)) {
            TicTacToe_board.boardDisplay(s);
            System.out.println(playerXO[player] + " turn");
            int position = scan.nextInt();
            if (s[(position - 1)].equals(" ")) {
                s[(position - 1)] = playerXO[player];
                turnNumber += 1;
                player = turnNumber % 2;
            } else {
                System.out.println("You pea brained giant!! you cant go there!! pick another spot");
            }
        }
        TicTacToe_board.boardDisplay(s);
        return Winner.isWinner(s);
    }
}
