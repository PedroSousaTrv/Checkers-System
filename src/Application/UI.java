package Application;

import CheckersGame.Color;
import CheckersGame.GamePiece;
import CheckersGame.GamePosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    //CORES POSSIVEIS DE USO
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

    public static void printBoard(GamePiece[][] pieces){

        for (int i = 0;i<pieces.length;i++){
            System.out.print(8-i+" ");
            for (int j = 0;j < pieces.length;j++){
                printPiece(pieces[i][j]);
            }
            System.out.println();
        }
        System.out.print("  A B C D E F G H");
    }

    public static GamePosition readGamePosition(Scanner sc){

        try {
            String scan = sc.nextLine();
            char ch = scan.charAt(0);
            int i = Integer.parseInt(scan.substring(1));

            return new GamePosition(ch,i);
        }catch (RuntimeException e){
            throw new InputMismatchException("Posição invalida");
        }

    }

    public static void printPiece(GamePiece piece){

        if(piece == null){
            System.out.print("- ");
        }else{

            if(piece.getColor() == Color.WHITE){
                System.out.print(ANSI_WHITE + piece + ANSI_RESET);
            }else {
                System.out.print(ANSI_BLACK + piece + ANSI_RESET);
            }
            System.out.print(" ");
        }
    }
}
