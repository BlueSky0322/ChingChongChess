package Objects;

import Objects.Pieces.ChessPiece;

public class Grid {
    private boolean isOccupied;
    private ChessPiece c;
    public Grid(){
        this.isOccupied = false;
    }

    public boolean CheckOccupied(){
        return isOccupied;
    }

    public void insertPiece(ChessPiece c){
        this.c = c;
        this.isOccupied = true;
    }

    public void printGrid(){
        if(isOccupied){
            System.out.println(c);
        }
        else System.out.println("Nothing here");
    }
}
