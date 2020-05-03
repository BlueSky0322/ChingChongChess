package Objects.Pieces;
import Objects.Colour;

import java.util.List;

public abstract class ChessPiece {
    boolean isDead;
    int position[];
    int player;
    Colour c;
    //private availableMoves;
    public void showAvailableMoves(){};
    public void moveTo(int position[]){};
    public abstract List<int[]> getMovable(int x, int y); //input is the current position of the selected chess piece
    public Colour getColour(){
        return c;
    }
}
