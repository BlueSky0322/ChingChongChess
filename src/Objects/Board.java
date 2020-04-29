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

    }

    public void printBoard(){
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i<9; i++){
                grid[i][j].printGrid();
            }
        }
    }
}
