package day17;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int counter = 0;

        while (counter < 4) {
            System.out.print(ChessPiece.PAWN_WHITE + " ");
            counter++;
        }
        while (counter > 0) {
            System.out.print(ChessPiece.ROOK_BLACK + " ");
            counter--;
        }
    }
}