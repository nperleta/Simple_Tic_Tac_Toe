package tictactoe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		final Scanner scanner = new Scanner(System.in);

		char[][] field = new char[3][3];
		int empty = 0;
		boolean xWins = false;
		boolean oWins = false;
		boolean exit = true;
		boolean player1 = true;

		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				field[row][column] = ' ';
				empty++;
			}
		}
		System.out.println("---------");
		System.out.println("| " + field[0][0] + " " + field[0][1] + " " + field[0][2] + " |");
		System.out.println("| " + field[1][0] + " " + field[1][1] + " " + field[1][2] + " |");
		System.out.println("| " + field[2][0] + " " + field[2][1] + " " + field[2][2] + " |");
		System.out.println("---------");
			
		while (exit) {
			System.out.println("Enter the coordinates: ");
			
			if (scanner.hasNextInt()) {
				int coord1 = scanner.nextInt();
				int coord2 = scanner.nextInt();
				
				if ((coord1 < 0 || coord1 > 3) || (coord2 < 0 || coord2 > 3)) {
					System.out.println("Coordinates should be from 1 to 3!");
				} else if (field[coord1 - 1][coord2 - 1] == 'O' || field[coord1 - 1][coord2 - 1] == 'X') {
					System.out.println("This cell is occupied! Choose another one!");
				} else if (field[coord1 - 1][coord2 - 1] == ' ') {
					if (player1 == true) {
						field[coord1 - 1][coord2 - 1] = 'X';
						player1 = false;		
					} else if (player1 == false) {
						field[coord1 - 1][coord2 - 1] = 'O';
						player1 = true;
					}
					System.out.println("---------");
					System.out.println("| " + field[0][0] + " " + field[0][1] + " " + field[0][2] + " |");
					System.out.println("| " + field[1][0] + " " + field[1][1] + " " + field[1][2] + " |");
					System.out.println("| " + field[2][0] + " " + field[2][1] + " " + field[2][2] + " |");
					System.out.println("---------");
				}
			} else {
				System.out.println("You should enter numbers!");
			}	
			
			if (field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X') {
				xWins = true;
			} else if (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X') {
				xWins = true;
			} else if (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X') {
				xWins = true;
			} else if (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X') {
				xWins = true;
			} else if (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X') {
				xWins = true;
			} else if (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X') {
				xWins = true;
			} else if (field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') {
				xWins = true;
			} else if (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X') {
				xWins = true;
			}
	
			if (field[0][0] == 'O' && field[0][1] == 'O' && field[0][2] == 'O') {
				oWins = true;
			} else if (field[1][0] == 'O' && field[1][1] == 'O' && field[1][2] == 'O') {
				oWins = true;
			} else if (field[2][0] == 'O' && field[2][1] == 'O' && field[2][2] == 'O') {
				oWins = true;
			} else if (field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O') {
				oWins = true;
			} else if (field[0][1] == 'O' && field[1][1] == 'O' && field[2][1] == 'O') {
				oWins = true;
			} else if (field[0][2] == 'O' && field[1][2] == 'O' && field[2][2] == 'O') {
				oWins = true;
			} else if (field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == 'O') {
				oWins = true;
			} else if (field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == 'O') {
				oWins = true;
			}
			if (xWins == true) {
				System.out.println("X wins");
				exit = false;
			} else if (oWins == true) {
				System.out.println("O wins");
				exit = false;
			} else if (xWins == false && oWins == false && empty == 0) {
				System.out.println("Draw");
				exit = false;
			} 
		}
	}
}
