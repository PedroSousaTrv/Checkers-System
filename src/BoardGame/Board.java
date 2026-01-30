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

    public void placePiece(Piece piece, Position position){
        pieces[position.getRow()][position.getColumn()] = piece;

        piece.position = position;
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
