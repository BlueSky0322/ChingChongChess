/***
 *Initializes the board with all the chess pieces on it
 * The board is initialized using the Grid class
 * @see Grid class
 */
package Objects;
import Objects.Pieces.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Board {
    private Grid grid[][] = new Grid[9][10];

    public Board() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                grid[i][j] = new Grid();
            }
        }
        //initializes the board by placing all the pieces onto their initial
        //position.
        grid[0][0].insertPiece(new Rook(1, Colour.RED));
        grid[1][0].insertPiece(new Knight(1, Colour.RED));
        grid[2][0].insertPiece(new Minister(1, Colour.RED));
        grid[3][0].insertPiece(new Advisor(1, Colour.RED));
        grid[4][0].insertPiece(new King(1, Colour.RED));
        grid[5][0].insertPiece(new Advisor(1, Colour.RED));
        grid[6][0].insertPiece(new Minister(1, Colour.RED));
        grid[7][0].insertPiece(new Knight(1, Colour.RED));
        grid[8][0].insertPiece(new Rook(1, Colour.RED));
        grid[1][2].insertPiece(new Cannon(1, Colour.RED));
        grid[7][2].insertPiece(new Cannon(1, Colour.RED));
        grid[0][3].insertPiece(new Pawn(1, Colour.RED));
        grid[2][3].insertPiece(new Pawn(1, Colour.RED));
        grid[4][3].insertPiece(new Pawn(1, Colour.RED));
        grid[6][3].insertPiece(new Pawn(1, Colour.RED));
        grid[8][3].insertPiece(new Pawn(1, Colour.RED));

        grid[0][9].insertPiece(new Rook(2, Colour.BLACK));
        grid[1][9].insertPiece(new Knight(2, Colour.BLACK));
        grid[2][9].insertPiece(new Minister(2, Colour.BLACK));
        grid[3][9].insertPiece(new Advisor(2, Colour.BLACK));
        grid[4][9].insertPiece(new King(2, Colour.BLACK));
        grid[5][9].insertPiece(new Advisor(2, Colour.BLACK));
        grid[6][9].insertPiece(new Minister(2, Colour.BLACK));
        grid[7][9].insertPiece(new Knight(2, Colour.BLACK));
        grid[8][9].insertPiece(new Rook(2, Colour.BLACK));
        grid[1][7].insertPiece(new Cannon(2, Colour.BLACK));
        grid[7][7].insertPiece(new Cannon(2, Colour.BLACK));
        grid[0][6].insertPiece(new Pawn(2, Colour.BLACK));
        grid[2][6].insertPiece(new Pawn(2, Colour.BLACK));
        grid[4][6].insertPiece(new Pawn(2, Colour.BLACK));
        grid[6][6].insertPiece(new Pawn(2, Colour.BLACK));
        grid[8][6].insertPiece(new Pawn(2, Colour.BLACK));

    }

    public void printBoard() {
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 9; i++) {
                grid[i][j].printGrid();
            }
            System.out.println();
        }
    }

    /**
     * @param x
     * @param y The x and y coordinates of the piece selected by the user
     * @return All the movable coordinates to be passed to the checkMovable function.
     */
    public List<int[]> showAvailableMoves(int x, int y) {
        if (!grid[x][y].CheckOccupied()) {
            return null;
        } else {
            return checkObstacle(checkMovable(grid[x][y].c.getMovable(x, y)), x, y);
        }

        //return list;
    }

    /**
     * @param list The coordinates of the possible moves made by the selected chess piece
     *             This function removes all the moves which are out of bounds
     * @return The possible moves that can be made by the selected chess piece
     */
    public List<int[]> checkMovable(List<int[]> list) {
        int count = 0, x, y;
        for (count = 0; count < list.size(); count++) {
            int arr[] = list.get(count);
            for (int j = 0; j < 2; j++) {
                if (arr[j] < 0) {
                    list.remove(count);
                    count--;
                    break;
                }
            }
        }

        return list;
    }

    /**
     * @param list The coordinates of the possible moves that can be made by the selected chess piece
     * @param x
     * @param y    x,y coordinates of the selected chesspiece
     * @return a list of legal moves that can be made (including capturing opponents piece)
     */
    public List<int[]> checkObstacle(List<int[]> list, int x, int y) {
        int count = 0;
        for (count = 0; count < list.size(); count++) {
            int arr[] = list.get(count);
            if (grid[arr[0]][arr[1]].CheckOccupied()) {
                if (grid[arr[0]][arr[1]].c.getColour() == grid[x][y].c.getColour()) {
                    list.remove(count);
                    count--;
                }
            }
        }
        for (int arr[] : list) {
            System.out.println(Arrays.toString(arr));
        }
        return list;
    }


    /***
     *
     * @param list The list of all legal moves
     *             The function checks whether the move is out of bounds for the king or advisor
     * @return  A list of all the final legal moves for the selected piece.
     */
    //TODO: Ryan
    public List<int[]> checkBounds(List<int[]> list) {
        return list;
    }
}