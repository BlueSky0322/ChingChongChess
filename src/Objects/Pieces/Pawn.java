package Objects.Pieces;
import Objects.Colour;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends ChessPiece {
    public Pawn(int player, Colour c){
        this.isDead = false;
        this.position = position;
        this.player = player;
        this.c =c;
    }
    public List<int[]> getMovable(int x, int y) {
        List<int[]> list = new ArrayList<int[]>();
        if (y<5){
            int arr[][] = {{x,y+1}};
            for (int ar[]: arr) {
                list.add(ar);
            }
        }
        else {
            int arr[][] = {{x+1,y},{x-1,y},{x,y+1}};
            for (int ar[]: arr) {
                list.add(ar);
            }
        }
        return list;
    }
}
