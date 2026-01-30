package CheckersGame;

import BoardGame.Position;

public class GamePosition{

    private char column;
    private int row;

    public GamePosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 0 || row > 8){
            throw new GameExeception("Posições de jogo invalidas");
        }
        this.column = column;
        this.row = row;
    }

    protected Position toPosition(){
        return new Position(8 - row, 'a' - column);
    }

    protected GamePosition FromPosition(Position position){
        return new GamePosition((char) ('h' - position.getColumn()), 8 - position.getRow());
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
}
