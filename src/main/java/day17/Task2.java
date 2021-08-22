package day17;

public class Task2 {
    public static void main(String[] args) {
        //избегаем использования "магических" чисел:)
        final int BOARD_LENGTH = 8;

        ChessPiece[][] chessPieces = new ChessPiece[BOARD_LENGTH][BOARD_LENGTH];

        ChessBoard chessBoards = new ChessBoard(chessPieces);

        chessPieces[0][0] = ChessPiece.ROOK_BLACK;
        chessPieces[0][5] = ChessPiece.ROOK_BLACK;
        chessPieces[0][6] = ChessPiece.KING_BLACK;

        chessPieces[1][1] = ChessPiece.ROOK_WHITE;
        chessPieces[1][4] = ChessPiece.PAWN_BLACK;
        chessPieces[1][5] = ChessPiece.PAWN_BLACK;
        chessPieces[1][7] = ChessPiece.PAWN_BLACK;

        chessPieces[2][0] = ChessPiece.PAWN_BLACK;
        chessPieces[2][2] = ChessPiece.KNIGHT_BLACK;
        chessPieces[2][6] = ChessPiece.PAWN_BLACK;

        chessPieces[3][0] = ChessPiece.QUEEN_BLACK;
        chessPieces[3][3] = ChessPiece.BISHOP_WHITE;

        chessPieces[4][3] = ChessPiece.BISHOP_BLACK;
        chessPieces[4][4] = ChessPiece.PAWN_WHITE;

        chessPieces[5][4] = ChessPiece.BISHOP_WHITE;
        chessPieces[5][5] = ChessPiece.PAWN_WHITE;

        chessPieces[6][0] = ChessPiece.PAWN_WHITE;
        chessPieces[6][3] = ChessPiece.QUEEN_WHITE;
        chessPieces[6][5] = ChessPiece.PAWN_WHITE;
        chessPieces[6][7] = ChessPiece.PAWN_WHITE;

        chessPieces[7][5] = ChessPiece.ROOK_WHITE;
        chessPieces[7][6] = ChessPiece.KING_WHITE;

        chessBoards.print();
    }
}