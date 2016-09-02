package nyc.c4q.hakeemsackesbramble;
import java.util.*;
/**
 * Created by hakeemsackes-bramble on 8/30/16.
 */
public class TactfulTickPlayer {
    public static void main(String[] args) {
        String[] s = {" "," "," "," ","x","o","x"," "," "};
        for(int i = 0; i < 5; i++){
            simplePlayer("x",s);
        }
    }

    public static void simplePlayer(String XorO, String[] board) {
        TicTacToe_board.boardDisplay(board);
        System.out.println(XorO + " turn");
        ArrayList<Integer> choices = new ArrayList<>();
        for(int i = 0; i < 9; i++ ){
            //boolean almostWinHorizontal =(board[(i)%9].equals(board[(i+1)%9]));
            boolean almostWinVertical = (board[(i+3)%9].equals(board[(i+6)%9]));
            boolean isUser = board[(i+3)%9].equals("X");
            boolean isEmpty = board[i].equals(" ");
            if(almostWinVertical && isUser && isEmpty) {
                choices.add(i);
            }
        }
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean almostWinHorizontal = board[((i * 3) + j)].equals(board[(i * 3) + ((j + 1) % 3)]);
                boolean isUser = board[((i * 3) + j)].equals("X");
                boolean isEmpty = board[(i * 3) + ((j + 2) % 3)].equals(" ");
                if (almostWinHorizontal && isUser && isEmpty) {  //adds
                    choices.add((i * 3) + ((j + 2) % 3));
                }
            }
        }
        for (int i = 0; i < 12; i += 4) {
            boolean almostWinHorizontal = board[(i)].equals(board[(i + 4) % 12]);
            boolean isUser = board[(i)].equals("X");
            boolean isEmpty = board[(i + 8) % 12].equals(" ");
            if (almostWinHorizontal && isUser && isEmpty) {
                choices.add((i + 8)% 12);
            }
        }
        for (int i = 0; i < 3; i += 1) {
            boolean almostWinHorizontal = board[i * 2 + 2].equals(board[((i+1) % 3) * 2 + 2]);
            // 2 4 6
            boolean isUser = board[(i * 2 + 2)].equals("X");
            boolean isEmpty = board[((i+2) % 3) * 2 + 2].equals(" ");
            if (almostWinHorizontal && isUser && isEmpty) {
                choices.add(((i+2) % 3) * 2 + 2);
            }
        }
        if(choices.size()==0) {
            for (int i = 0; i < 9; i++) {
                if (board[i].equals(" ")) {
                    choices.add(i);
                }
            }
        }
        int compChoice = (int) (Math.random() * (choices.size()));
        int position = choices.get(compChoice);
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
        board[(position)] = XorO;
    }
}
