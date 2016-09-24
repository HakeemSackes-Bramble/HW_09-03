package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/29/16.
 */
public class TicTacToe_board {
    public static void main(String[] args) {
    }
    //tic tac toe steps:
    //1 disp board done
    //prompt user to choose position done
    //2 take input of position  done
    // automate the O player done
    // check for winner and reiterate if false done
    // if winner is true disp winner and board


    static void boardDisplay(String[] array) {
        String space = "                ";

        System.out.println("_ _ _" + space + "type number to choose next position");
        for (int j = 1; j < 4; j++) {
            int p = 3 * j - 1;
            String guide = (p - 1) + "|" + (p) + "|" + (p + 1); //string that shows user a guide for input
            System.out.println(array[p - 2] + "|" + array[p - 1] + "|" + array[p] + space + guide);
        }
    }
}
