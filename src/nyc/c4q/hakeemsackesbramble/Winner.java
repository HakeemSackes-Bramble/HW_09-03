package nyc.c4q.hakeemsackesbramble;


/**
 * Created by hakeemsackes-bramble on 8/30/16.
 */
public class Winner {
    public static void main(String[] args) {

        //isWinner();
    }
    static boolean isWinner(String[] s){
        boolean didSomeOneWin = false;

        for(int i = 0; i<3; i++){


            if (!didSomeOneWin) {
                boolean winVertical = (s[i].equals(s[i + 3])) && (s[i + 3].equals(s[i + 6]));
                boolean isEmpty = !(s[i].equals(" "));
                didSomeOneWin = winVertical && isEmpty;

            }if (!didSomeOneWin) {
                boolean winHorizontal = (s[(i * 3)].equals(s[(i * 3) + 1])) && (s[(i * 3) + 1].equals(s[(i * 3) + 2]));
                boolean isitEmpty = !(s[i*3].equals(" "));
                didSomeOneWin = winHorizontal && isitEmpty;

            }if (!didSomeOneWin) {
                boolean winDiagonal = (s[(i)].equals(s[4])) && (s[4].equals(s[8 - i]));
                boolean isEmpty = !(s[i].equals(" "));
                didSomeOneWin = winDiagonal && isEmpty;
            }
        }
        return didSomeOneWin;
    }
}
