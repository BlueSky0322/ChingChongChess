package Objects;

import Objects.Pieces.*;

public class Grid {
    private boolean isOccupied;
    public ChessPiece c;
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

    public void removePiece(){
        this.c = null;
        this.isOccupied = false;
    }

    public void printGrid(){
        if(isOccupied){
            if (this.c instanceof Rook){
                System.out.print("车");
            }
            else if (this.c instanceof Knight){
                System.out.print("马");
            }
            else if (this.c instanceof Minister){
                System.out.print("相");
            }
            else if (this.c instanceof Advisor){
                System.out.print("士");
            }
            else if (this.c instanceof King){
                System.out.print("将");
            }
            else if (this.c instanceof Pawn){
                System.out.print("卒");
            }
            else if (this.c instanceof Cannon){
                System.out.print("炮");
            }
        }
        else System.out.print("X");
        System.out.print(" | ");
    }


}
