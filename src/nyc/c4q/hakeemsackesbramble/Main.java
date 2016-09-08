package nyc.c4q.hakeemsackesbramble;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    boolean a = true;
        while(a){
            System.out.println("\nTactfulTick: " + TactfulTickDialogue.braggingTick()+"\n");
            TicTacToeGame.ticTacToegame();
            a = playAgain();
        }

    }
    private static boolean playAgain() {
        System.out.println("Would you like to play again?  Y(yes) or N(no). ");
        Scanner scan = new Scanner(System.in);
        String answer = scan.next();
        String lowanswer = answer.toLowerCase();
        boolean play = false;
        if((lowanswer.equals("yes")) || (lowanswer.equals("y"))){
            play = true;
        }else if((lowanswer.equals("no")) || (lowanswer.equals("n"))){
            play = false;
        }else{
            playAgain();
        }
        return play;
    }

}
