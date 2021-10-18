package tictactoe;

import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter 9 symbols (X, O and _)\n");

        String input = s.next();

        char s1 = input.charAt(0), s2 = input.charAt(1), s3 = input.charAt(2),
                s4 = input.charAt(3), s5 = input.charAt(4), s6 = input.charAt(5),
                s7 = input.charAt(6), s8 = input.charAt(7), s9 = input.charAt(8),
                I = '|', blank = '_';

        Game.enterCoordinates(s1, s2, s3, s4, s5, s6, s7, s8, s9, I, blank);
    }
}
