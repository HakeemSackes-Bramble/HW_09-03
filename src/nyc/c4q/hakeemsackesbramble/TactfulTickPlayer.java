package nyc.c4q.hakeemsackesbramble;
import java.awt.*;
import java.util.*;
/**
 * Created by hakeemsackes-bramble on 8/30/16.
 */
public class TactfulTickPlayer {
    public static void main(String[] args) {

    }

    public static void simplePlayer(String XorO, String[] board) {
        Random text = new Random();
        TicTacToe_board.boardDisplay(board);
        System.out.println(XorO + " turn");
        ArrayList<Integer> choices = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            int value1 = (i + 3) % 9;
            int value2 = (i + 6) % 9;
            int value3 = i;
            //boolean almostWinHorizontal =(board[(i)%9].equals(board[(i+1)%9]));
            if (winchecker(board, value1, value2, value3, "X")) {
                choices.add(value3);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int value1 = ((i * 3) + j);
                int value2 = (i * 3) + ((j + 1) % 3);
                int value3 = (i * 3) + ((j + 2) % 3);
                if (winchecker(board, value1, value2, value3, "X")) {
                    choices.add(value3);
                }
            }
        }
        for (int i = 0; i < 12; i += 4) {
            int value2 = (i + 4) % 12;
            int value3 = (i + 8) % 12;
            if (winchecker(board, i, value2, value3, "X")) {
                choices.add(value3);
            }
        }
        for (int i = 0; i < 3; i += 1) {
            int value1 = i * 2 + 2;
            int value2 = ((i + 1) % 3) * 2 + 2;
            int value3 = ((i + 2) % 3) * 2 + 2;
            if (winchecker(board, value1, value2, value3, "X")) {
                choices.add(value3);
            }
        }
        if (choices.size() == 0) {
            for (int i = 0; i < 9; i++) {
                if (board[i].equals(" ")) {
                    choices.add(i);
                    int compChoice = text.nextInt(choices.size());
                    int position = choices.get(compChoice);
                    board[(position)] = XorO;
                    return;
                }
            }
        }
        if(choices.size() == 0 && !Winner.isWinner(board)){
            System.out.println("I tied!!! With you!!! UGH!!");
            return;
        }else {

            int compChoice = text.nextInt(choices.size());
            int position = choices.get(compChoice);
            board[(position)] = XorO;
        }
//
// int position = (int) (Math.random() * 9);
//        if(board[(position)].equals(" ")){
//            board[(position)] = XorO;
//        }else {
//            while (!(board[(position)].equals(" "))) {
//                position = (int) (Math.random() * 9);
//                board[(position)] = XorO;
//                System.out.println(position);
//                //turnNumber += 1;
//                //player = turnNumber % 2;
//            }
//        }

    }

    public static boolean winchecker(String[] board, int index, int index1, int index2, String player) {
        boolean almostWinning = board[index].equals(board[index1]);
        boolean isUser = board[index].equals(player);
        boolean isEmpty = board[index2].equals(" ");
        return almostWinning && isUser && isEmpty;
    }

}

