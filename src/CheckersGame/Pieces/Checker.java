package CheckersGame.Pieces;

import BoardGame.Board;
import CheckersGame.Color;
import CheckersGame.GamePiece;

public class Checker extends GamePiece {
    public Checker(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "O";
    }
}
