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

    public void performMove(GamePosition source, GamePosition target){

        Position sourcePosition = source.toPosition();
        Position targetPosition = target.toPosition();




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
        placeNewPiece('a',8, new Checker(board,Color.BLACK));
        placeNewPiece('b',7, new Checker(board,Color.BLACK));
        placeNewPiece('a',6, new Checker(board,Color.BLACK));
        placeNewPiece('c',8, new Checker(board,Color.BLACK));
        placeNewPiece('c',6, new Checker(board,Color.BLACK));
        placeNewPiece('e',6, new Checker(board,Color.BLACK));
        placeNewPiece('d',7, new Checker(board,Color.BLACK));
        placeNewPiece('e',8, new Checker(board,Color.BLACK));
        placeNewPiece('c',6, new Checker(board,Color.BLACK));
        placeNewPiece('f',7, new Checker(board,Color.BLACK));
        placeNewPiece('g',8, new Checker(board,Color.BLACK));
        placeNewPiece('g',6, new Checker(board,Color.BLACK));
        placeNewPiece('h',7, new Checker(board,Color.BLACK));

        placeNewPiece('a',2, new Checker(board,Color.WHITE));
        placeNewPiece('b',1, new Checker(board,Color.WHITE));
        placeNewPiece('b',3, new Checker(board,Color.WHITE));
        placeNewPiece('c',2, new Checker(board,Color.WHITE));
        placeNewPiece('d',1, new Checker(board,Color.WHITE));
        placeNewPiece('d',3, new Checker(board,Color.WHITE));
        placeNewPiece('e',2, new Checker(board,Color.WHITE));
        placeNewPiece('f',1, new Checker(board,Color.WHITE));
        placeNewPiece('f',3, new Checker(board,Color.WHITE));
        placeNewPiece('g',2, new Checker(board,Color.WHITE));
        placeNewPiece('h',3, new Checker(board,Color.WHITE));
        placeNewPiece('h',1, new Checker(board,Color.WHITE));
    }

}
