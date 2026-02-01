package BoardGame;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int columns){
        return pieces[row][columns];
    }

    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece;

        piece.position = position;
    }

    public Piece removePiece(Position position){

        if(!positionExist(position)){
            throw new BoardExeption("Postion not on the board");
        }

        if(piece(position) == null){
            return null;
        }

        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    private boolean positionExist(Position position){
        return position.getRow() > 0 && position.getRow() < 7 && position.getColumn() > 0 && position.getColumn() < 7;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece[][] getPiece() {
        return pieces;
    }
}
