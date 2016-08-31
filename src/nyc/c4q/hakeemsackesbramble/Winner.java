package nyc.c4q.hakeemsackesbramble;


/**
 * Created by hakeemsackes-bramble on 8/30/16.
 */
public class Winner {
    public static void main(String[] args) {

        //isWinner();
    }
    static boolean isWinner(String[] s){
        boolean win = false;
        for(int i = 0; i<3; i++){
            if (!win) {
                boolean winVertical = (s[i].equals(s[i + 3])) && (s[i + 3].equals(s[i + 6]));
                boolean isEmpty = !(s[i].equals(" "));
                win = winVertical && isEmpty;
            }if (!win) {
                boolean winHorizontal = (s[(i * 3)].equals(s[(i * 3) + 1])) && (s[(i * 3) + 1].equals(s[(i * 3) + 2]));
                boolean isEmpty = !(s[i*3].equals(" "));
                win = winHorizontal && isEmpty;
            }if (!win) {
                boolean winDiagonal = (s[(i)].equals(s[4])) && (s[4].equals(s[8 - i]));
                boolean isEmpty = !(s[i].equals(" "));
                win = winDiagonal && isEmpty;
            }
        }
/*
if(!win){
boolean winDiagonal2 = (s[(2)].equals(s[4])) && (s[4].equals(s[6]));
boolean isEmpty = !(s[2].equals(" "));
win = winDiagonal2 && isEmpty;
}
*/
        return win;
    }
}
