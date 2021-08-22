package day17;

public class ChessBoard {

    private ChessPiece[][] chessPieces;

    public ChessBoard(ChessPiece[][] chessPieces) {
        this.chessPieces = chessPieces;
    }

    public void print() {
        for (ChessPiece[] chessPiece : chessPieces) {
            for (ChessPiece piece : chessPiece) {
                System.out.print(piece != null ? piece : ChessPiece.EMPTY);
            }
            System.out.println();
        }
    }
}