
import java.util.*;

class Player {

    //'x' or 'o'
    char name;

    public int[] getInput() {
        //1. Handle getting input and turning input into an array
        //2. (do later) Handle invalid input
    }

}

class Board {

    private int[][] representation = new int[3][3];

    public boolean isSpaceFree(int[] space) {
        //(do later) Check if space is taken in representation
    }

    public void takeSpace(int[] space, Player player) {
        //Mark space in representation as taken for player
    }

    public String toString() {
        //Returns the String that is printed when someone System.out.println(board)
    }

}

class TicTacToeGame {

    Player player1;
    Player player2;
    Board board;

    TicTacToeGame(Player player1, Player player2) {
        //Set up a new game
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
    }

    public Player getNextPlayer(int turn) {
        //If turn is even player1 else player 2
    }

    public boolean isOver() {
        //(do later) Check for win
    }

    public String getWinner() {
        //(do later)Get the winner, duh
    }

}

public class TicTacToe {

    public static void main(String[] args) {
        //Test your method implementations here

        //Example test
        Player p1 = new Player();
        Player p2 = new Player();
        Board board = new Board();

        TicTacToeGame game = new TicTacToeGame(p1, p2, board);

        for (int i = 0; i < 10; i++) {
            System.out.println(game.getNextPlayer(i));
        }

        //End of testing section
        //Remove System.exit() to allow the actual game to attempt to run.
        System.exit();

        //Make players
        //Make players
        Player player1 = new Player();
        Player player2 = new Player();

        //Make a board
        Board board = new Board();

        //Make a game with 2 players on a board
        TicTacToeGame game = new TicTacToeGame(player1, player2, board);

        //Can play up to 10 turns
        for (int turn = 0; turn < 10; turn++) {
            //Show the board
            System.out.println(game.board);

            if (game.isOver()) {
                System.out.println("Game over!");
                System.out.println("Winner is:" + game.getWinner());
                //Exits the for loop prematurely
                break;
            }

            //Returns the player whose turn it is
            Player currentPlayer = game.getNextPlayer(turn);

            int[] input = currentPlayer.getInput();

            if (!game.board.isSpaceFree(input)) {
                System.out.println("Space is not free!");
                //Redo the turn
                turn--;
                continue;
            } else {
                game.board.takeSpace(input, currentPlayer);
            }
            //End of turn
        }
        // Game over!
    }
}
