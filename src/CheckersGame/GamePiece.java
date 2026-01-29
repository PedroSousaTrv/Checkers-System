package CheckersGame;

import BoardGame.Board;
import BoardGame.Piece;

public class GamePiece extends Piece {

    private Color color;

    public GamePiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
