package tictactoe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter 9 symbols (X, O and _)\n");

        String input = s.next();

        char s1 = input.charAt(0), s2 = input.charAt(1), s3 = input.charAt(2),
                s4 = input.charAt(3), s5 = input.charAt(4), s6 = input.charAt(5),
                s7 = input.charAt(6), s8 = input.charAt(7), s9 = input.charAt(8),
                I = '|';

        System.out.println("---------\n" + I + " " + s1 + " " + s2 + " " + s3 + " " + I + "\n" +
                I + " " + s4 + " " + s5 + " " + s6 + " " + I + "\n" + I + " " + s7 + " " +
                s8 + " " + s9 + " " + I + "\n" + "---------");


        GameSystem.checkXAndO(s1,s2, s3, s4 ,s5, s6, s7, s8, s9);
        GameSystem.checkIfXWins(s1,s2, s3, s4 ,s5, s6, s7, s8, s9);
        GameSystem.checkIfOWins(s1,s2, s3, s4 ,s5, s6, s7, s8, s9);
        GameSystem.testGame(GameSystem.getXs(),GameSystem.getOs());

    }
}
