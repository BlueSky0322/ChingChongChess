package Objects.Pieces;
import Objects.Colour;

import java.util.List;

public class Minister extends ChessPiece {
    public Minister(int player, Colour c){
        this.isDead = false;
        this.position = position;
        this.player = player;
        this.c = c;
    }
    public List<int[]> getMovable(int x, int y) {return null;}
}
