package CheckersGame;

import BoardGame.Board;
import BoardGame.Position;
import CheckersGame.Pieces.Checker;

public class GameMatch {

    private Board board;

    public GameMatch() {
        board = new Board(8,8);
        initialSetup();
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

    private void placeNewPiece(char column, int row,GamePiece gamePiece){
        board.placePiece(gamePiece, new GamePosition(column, row).toPosition());
    }

    public void initialSetup(){
        placeNewPiece('a',2, new Checker(board,Color.WHITE));
        placeNewPiece('a',3, new Checker(board,Color.WHITE));
        placeNewPiece('a',4, new Checker(board,Color.WHITE));

    }

}
