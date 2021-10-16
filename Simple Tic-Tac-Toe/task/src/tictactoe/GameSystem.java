package tictactoe;

import java.util.ArrayList;
import java.util.List;

public class GameSystem {

    private static boolean xWins;
    private static boolean oWins;

    public static void checkXAndO(char s1, char s2, char s3, char s4,
                                  char s5, char s6, char s7, char s8, char s9) {

        List<Character> x = new ArrayList<>();
        List<Character> o = new ArrayList<>();

        // test input on X
        if (s1 == 'X') {
            x.add(s1);
        } else if (s2 == 'X') {
            x.add(s2);
        } else if (s3 == 'X') {
            x.add(s3);
        } else if (s4 == 'X') {
            x.add(s4);
        } else if (s5 == 'X') {
            x.add(s5);
        } else if (s6 == 'X') {
            x.add(s6);
        } else if (s7 == 'X') {
            x.add(s7);
        } else if (s8 == 'X') {
            x.add(s8);
        } else if (s9 == 'X') {
            x.add(s9);
        }
        int xs = x.size();

        // test input on X
        if (s1 == 'O') {
            o.add(s1);
        } else if (s2 == 'O') {
            o.add(s2);
        } else if (s3 == 'O') {
            o.add(s3);
        } else if (s4 == 'O') {
            o.add(s4);
        } else if (s5 == 'O') {
            o.add(s5);
        } else if (s6 == 'O') {
            o.add(s6);
        } else if (s7 == 'O') {
            o.add(s7);
        } else if (s8 == 'O') {
            o.add(s8);
        } else if (s9 == 'O') {
            o.add(s9);
        }
        int os = o.size();
    }

    public static boolean checkIfXWins(char s1, char s2, char s3, char s4,
                                       char s5, char s6, char s7, char s8, char s9) {

        String xo1 = String.valueOf(s1 + s2 + s3);
        String xo2 = String.valueOf(s4 + s5 + s6);
        String xo3 = String.valueOf(s7 + s8 + s9);

        String xo4 = String.valueOf(s1 + s4 + s7);
        String xo5 = String.valueOf(s2 + s5 + s8);
        String xo6 = String.valueOf(s3 + s6 + s9);

        String xo7 = String.valueOf(s1 + s5 + s9);
        String xo8 = String.valueOf(s7 + s5 + s3);

        if ( xo1 == "XXX") {
            xWins = true;
        } else if ( xo2 == "XXX") {
            xWins = true;
        } else if ( xo3 == "XXX") {
            xWins = true;
        } else if ( xo4 == "XXX") {
            xWins = true;
        } else if ( xo5 == "XXX") {
            xWins = true;
        } else if ( xo6 == "XXX") {
            xWins = true;
        } else if ( xo7 == "XXX") {
            xWins = true;
        } else if ( xo8 == "XXX") {
            xWins = true;
        } xWins = false;
        return xWins;
    }

    public static boolean checkIfOWins(char s1, char s2, char s3, char s4,
                                       char s5, char s6, char s7, char s8, char s9) {

        String xo1 = String.valueOf(s1 + s2 + s3);
        String xo2 = String.valueOf(s4 + s5 + s6);
        String xo3 = String.valueOf(s7 + s8 + s9);

        String xo4 = String.valueOf(s1 + s4 + s7);
        String xo5 = String.valueOf(s2 + s5 + s8);
        String xo6 = String.valueOf(s3 + s6 + s9);

        String xo7 = String.valueOf(s1 + s5 + s9);
        String xo8 = String.valueOf(s7 + s5 + s3);

        if ( xo1 == "OOO") {
            oWins = true;
        } else if ( xo2 == "OOO") {
            oWins = true;
        } else if ( xo3 == "OOO") {
            oWins = true;
        } else if ( xo4 == "OOO") {
            oWins = true;
        } else if ( xo5 == "OOO") {
            oWins = true;
        } else if ( xo6 == "OOO") {
            oWins = true;
        } else if ( xo7 == "OOO") {
            oWins = true;
        } else if ( xo8 == "OOO") {
            oWins = true;
        } oWins = false;
        return oWins;
    }

    public static void testGame(int xs, int os) {

        if (xWins == true) {
            System.out.println("X wins");
        } else if(oWins == true) {
            System.out.println("O wins");
        } else if((xs + os != 9)) {
            System.out.println("Game not finished");
        } else if (xs - os > 1 ||  os - xs > 1) {
            System.out.println("Impossible");
        } else if (xs + os == 9) {
            System.out.println("Draw");
        }
    }
}
