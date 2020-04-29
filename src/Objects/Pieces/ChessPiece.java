package Objects.Pieces;
import Objects.Colour;

public abstract class ChessPiece {
    boolean isDead;
    int position[];
    int player;
    Colour c;
    //private availableMoves;
    public void showAvailableMoves(){
        System.out.print("Hello");
    };
    public void moveTo(int position[]){};
}
