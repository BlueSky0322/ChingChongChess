/***
 *
 */
package Objects;
import Objects.Pieces.*;
public class Board {
    private Grid grid[][] = new Grid[9][10];
    public Board(){
        for (int i = 0; i<9; i++){
            for (int j = 0; j<10; j++) {
                grid[i][j] = new Grid();
            }
        }

        grid[0][0].insertPiece(new Rook(1,Colour.RED));
        grid[1][0].insertPiece(new Knight(1,Colour.RED));
        grid[2][0].insertPiece(new Minister(1,Colour.RED));
        grid[3][0].insertPiece(new Advisor(1,Colour.RED));
        grid[4][0].insertPiece(new King(1,Colour.RED));
        grid[5][0].insertPiece(new Advisor(1,Colour.RED));
        grid[6][0].insertPiece(new Minister(1,Colour.RED));
        grid[7][0].insertPiece(new Knight(1,Colour.RED));
        grid[8][0].insertPiece(new Rook(1,Colour.RED));
        grid[1][2].insertPiece(new Cannon(1,Colour.RED));
        grid[7][2].insertPiece(new Cannon(1,Colour.RED));
        grid[0][3].insertPiece(new Pawn(1,Colour.RED));
        grid[2][3].insertPiece(new Pawn(1,Colour.RED));
        grid[4][3].insertPiece(new Pawn(1,Colour.RED));
        grid[6][3].insertPiece(new Pawn(1,Colour.RED));
        grid[8][3].insertPiece(new Pawn(1,Colour.RED));

        grid[0][9].insertPiece(new Rook(2,Colour.BLACK));
        grid[1][9].insertPiece(new Knight(2,Colour.BLACK));
        grid[2][9].insertPiece(new Minister(2,Colour.BLACK));
        grid[3][9].insertPiece(new Advisor(2,Colour.BLACK));
        grid[4][9].insertPiece(new King(2,Colour.BLACK));
        grid[5][9].insertPiece(new Advisor(2,Colour.BLACK));
        grid[6][9].insertPiece(new Minister(2,Colour.BLACK));
        grid[7][9].insertPiece(new Knight(2,Colour.BLACK));
        grid[8][9].insertPiece(new Rook(2,Colour.BLACK));
        grid[1][7].insertPiece(new Cannon(2,Colour.BLACK));
        grid[7][7].insertPiece(new Cannon(2,Colour.BLACK));
        grid[0][6].insertPiece(new Pawn(2,Colour.BLACK));
        grid[2][6].insertPiece(new Pawn(2,Colour.BLACK));
        grid[4][6].insertPiece(new Pawn(2,Colour.BLACK));
        grid[6][6].insertPiece(new Pawn(2,Colour.BLACK));
        grid[8][6].insertPiece(new Pawn(2,Colour.BLACK));
    
    }

    public void printBoard(){
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i<9; i++){
                grid[i][j].printGrid();
            }
        }
    }
}
