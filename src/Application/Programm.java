package Application;

import CheckersGame.GameMatch;
import CheckersGame.GamePiece;
import CheckersGame.GamePosition;

import java.util.Scanner;

public class Programm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GameMatch gameMatch = new GameMatch();

        while (true) {
            UI.printBoard(gameMatch.getPiece());

            System.out.println("Posição Inicial: ");
            GamePosition source = UI.readGamePosition(sc);

            System.out.println("Posição Final: ");
            GamePosition target = UI.readGamePosition(sc);

            gameMatch.performMove(source,target);

        }


    }
}
