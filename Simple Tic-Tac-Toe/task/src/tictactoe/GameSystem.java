package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class GameSystem {

    private static boolean xWins;
    private static boolean oWins;
    private static int xs;
    private static int os;

    public static boolean isXWins() {
        return xWins;
    }

    public static void setXWins(boolean xWins) {
        GameSystem.xWins = xWins;
    }

    public static boolean isOWins() {
        return oWins;
    }

    public static void setOWins(boolean oWins) {
        GameSystem.oWins = oWins;
    }
    public static int getXs() {
        return xs;
    }

    public static void setXs(int xs) {
        GameSystem.xs = xs;
    }

    public static int getOs() {
        return os;
    }

    public static void setOs(int os) {
        GameSystem.os = os;
    }

    static List<Character> x = new ArrayList<>();
    static List<Character> o = new ArrayList<>();

    public static void checkXAndO(char s1, char s2, char s3, char s4,
                                  char s5, char s6, char s7, char s8, char s9) {
        if (s1 == 'X') {
            x.add(s1);
        } else if (s1 == 'O')
            o.add(s1);

        if (s2 == 'X') {
            x.add(s2);
        } else if (s2 == 'O')
            o.add(s2);

        if (s3 == 'X') {
            x.add(s3);
        } else if (s3 == 'O')
            o.add(s3);

        if (s4 == 'X') {
            x.add(s4);
        } else if (s4 == 'O')
            o.add(s4);

        if (s5 == 'X') {
            x.add(s5);
        } else if (s5 == 'O')
            o.add(s5);

        if (s6 == 'X') {
            x.add(s6);
        } else if (s6 == 'O')
            o.add(s6);

        if (s7 == 'X') {
            x.add(s7);
        } else if (s7 == 'O')
            o.add(s7);

        if (s8 == 'X') {
            x.add(s8);
        } else if (s8 == 'O')
            o.add(s8);

        if (s9 == 'X') {
            x.add(s9);
        } else if (s9 == 'O')
            o.add(s9);

        xs = x.size();
        setXs(xs);
        os = o.size();
        setOs(os);
    }

    public static void checkIfXWins(char s1, char s2, char s3, char s4,
                                       char s5, char s6, char s7, char s8, char s9) {

        int xo1 = s1 + s2 + s3;
        int xo2 = s4 + s5 + s6;
        int xo3 = s7 + s8 + s9;

        int xo4 = s1 + s4 + s7;
        int xo5 = s2 + s5 + s8;
        int xo6 = s3 + s6 + s9;

        int xo7 = s1 + s5 + s9;
        int xo8 = s7 + s5 + s3;

        if ( xo1 == 264) {
            xWins = true;
        } else if ( xo2 == 264) {
            xWins = true;
        } else if ( xo3 == 264) {
            xWins = true;
        } else if ( xo4 == 264) {
            xWins = true;
        } else if ( xo5 == 264) {
            xWins = true;
        } else if ( xo6 == 264) {
            xWins = true;
        } else if ( xo7 == 264) {
            xWins = true;
        } else if ( xo8 == 264) {
            xWins = true;
        }
        setXWins(xWins);
    }

    public static void checkIfOWins(char s1, char s2, char s3, char s4,
                                       char s5, char s6, char s7, char s8, char s9) {

        int xo1 = s1 + s2 + s3;
        int xo2 = s4 + s5 + s6;
        int xo3 = s7 + s8 + s9;

        int xo4 = s1 + s4 + s7;
        int xo5 = s2 + s5 + s8;
        int xo6 = s3 + s6 + s9;

        int xo7 = s1 + s5 + s9;
        int xo8 = s7 + s5 + s3;

        if (xo1 == 237) {
            oWins = true;
        } else if (xo2 == 237) {
            oWins = true;
        } else if (xo3 == 237) {
            oWins = true;
        } else if (xo4 == 237) {
            oWins = true;
        } else if (xo5 == 237){
            oWins = true;
        } else if (xo6 == 237) {
            oWins = true;
        } else if (xo7 == 237) {
            oWins = true;
        } else if (xo8 == 237) {
            oWins = true;
        }
        setOWins(oWins);
    }

    public static void testGame(int xs, int os) {

        if (xWins == true && oWins == true) {
            System.out.println("Impossible");
            } else if (xs - os > 1 || os - xs > 1) {
                System.out.println("Impossible");
            } else if(( isOWins() == false
                && isXWins() == false && xs + os < 9)) {
            System.out.println("Game not finished");
            } else if (isOWins() == false && isXWins() == false && xs + os == 9) {
                System.out.println("Draw");
            }else if (isXWins()) {
                System.out.println("X wins");
            } else if(isOWins()) {
            System.out.println("O wins");
            }
    }
}