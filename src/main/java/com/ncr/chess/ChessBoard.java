package com.ncr.chess;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void addPiece(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(xCoordinate < MAX_BOARD_WIDTH && yCoordinate < MAX_BOARD_HEIGHT  && pieces[xCoordinate][yCoordinate] == null) {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        } else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }

    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate < 7 && xCoordinate >= 0 && yCoordinate >= 0 && yCoordinate < 7) {
            return true;
         }
        else return false;
    }
}
