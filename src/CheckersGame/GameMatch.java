package CheckersGame;

import BoardGame.Board;

public class GameMatch {

    private Board board;

    public GameMatch() {
        board = new Board(8,8);
    }

    public GamePiece[][] getPiece(){

        GamePiece[][] mat = new GamePiece[board.getRows()][board.getColumns()];

        for (int i = 0; i<board.getRows();i++){
            for (int j = 0; j<board.getColumns();j++){
                mat[i][j] = (GamePiece) board.piece(i,j);
            }
        }
        return mat;
    }

}
