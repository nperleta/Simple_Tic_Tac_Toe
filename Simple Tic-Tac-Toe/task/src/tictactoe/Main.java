package tictactoe;

public class Main() {

    public static void main(String[] args) {

        Game.generateGame();
        GameSystem.checkXAndO();
        GameSystem.checkIfXWins();
        GameSystem.checkIfOWins();
        GameSystem.testGame();

    }
}
