package tictactoe;

import java.util.Scanner;

public class Game {

    static boolean out = true;
    static Scanner s = new Scanner(System.in);

    public static boolean isOut() {
        return out;
    }

    public static void setOut(boolean out) {
        Game.out = out;
    }

    public static void enterCoordinates(char s1, char s2, char s3, char s4, char s5,
                                        char s6, char s7, char s8, char s9, char I, char blank) {

        System.out.println("---------\n" + I + " " + s1 + " " + s2 + " " + s3 + " " + I + "\n" +
                I + " " + s4 + " " + s5 + " " + s6 + " " + I + "\n" + I + " " + s7 + " " +
                s8 + " " + s9 + " " + I + "\n" + "---------");

        do {
            System.out.println("Enter the coordinates: \n");
            int coordinates1 = s.nextInt();
            int coordinates2 = s.nextInt();
            String coordinates = String.format(coordinates1 + " " + coordinates2);

            /*coordinates += s.nextLine();
            coordinates.replaceAll(" ", "\r");*/
            System.out.println(coordinates);

            switch(coordinates) {
                case "1 1":
                    if (s1 == 'X' || s1 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s1 == blank) {
                        s1 = 'X';
                    }
                    break;
                case "1 2":
                    if (s2 == 'X' || s2 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s2 == blank) {
                        s2 = 'X';
                    }
                    break;
                case "1 3":
                    if (s3 == 'X' || s3 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s3 == blank) {
                        s3 = 'X';
                    }
                    break;
                case "2 1":
                    if (s4 == 'X' || s4 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s4 == blank) {
                        s4 = 'X';
                    }
                    break;
                case "2 2":
                    if (s5 == 'X' || s5 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s5 == blank) {
                        s5 = 'X';
                    }
                    break;
                case "2 3":
                    if (s6 == 'X' || s6 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s6 == blank) {
                        s6 = 'X';
                    }
                    break;
                case "3 1":
                    if (s7 == 'X' || s7 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s7 == blank) {
                        s7 = 'X';
                    }
                    break;
                case "3 2":
                    if (s8 == 'X' || s8 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s8 == blank) {
                        s8 = 'X';
                    }
                    break;
                case "3 3":
                    if (s9 == 'X' || s9 == 'O') {
                        System.out.println("This cell is occupied! Choose another one!");
                    } else if (s9 == blank) {
                        s9 = 'X';
                    }
                    break;
                case "out":
                    System.out.println("bye");
                    out = !out;
                    break;
                default: // problem
                    if (coordinates.matches(("\\d"))) {
                        System.out.println("Coordinates should be from 1 to 3!");
                    } else {
                        System.out.println("You should enter numbers!");
                    }
                    break;
            }

            GameRulesSystem.checkXAndO(s1, s2, s3, s4, s5, s6, s7, s8, s9);
            GameRulesSystem.checkIfXWins(s1, s2, s3, s4, s5, s6, s7, s8, s9);
            GameRulesSystem.checkIfOWins(s1, s2, s3, s4, s5, s6, s7, s8, s9);
            GameRulesSystem.testGame(GameRulesSystem.getXs(), GameRulesSystem.getOs(), out);

            System.out.println("---------\n" + I + " " + s1 + " " + s2 + " " + s3 + " " + I + "\n" +
                    I + " " + s4 + " " + s5 + " " + s6 + " " + I + "\n" + I + " " + s7 + " " +
                    s8 + " " + s9 + " " + I + "\n" + "---------");
        } while (out = out);

    }

}
