
import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
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

            //Returns the player whos turn it is
            Player currentPlayer = game.getNextPlayer(turn);

            int[] input = currentPlayer.getInput();

            if (!game.board.isSpaceFree(input)) {
                System.out.println("Space is not free!");
                //Redo the turn
                turn--;
                continue;
            } else {
                game.board.takeSpace(currentPlayer, input);
            }
            //End of turn
        }
        // Game over!
    }
}
