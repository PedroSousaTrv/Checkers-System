package CheckersGame.Pieces;

import BoardGame.Board;
import CheckersGame.Color;
import CheckersGame.GamePiece;

public class Queen extends GamePiece {
    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
