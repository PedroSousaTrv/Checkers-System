package Application;

import CheckersGame.GameMatch;
import CheckersGame.GamePiece;

public class Programm {
    public static void main(String[] args) {

     GameMatch gameMatch = new GameMatch();

     UI.printBoard(gameMatch.getPiece());

    }
}
