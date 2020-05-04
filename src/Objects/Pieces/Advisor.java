package Objects.Pieces;
import Objects.Colour;

import java.util.ArrayList;
import java.util.List;

public class Advisor extends ChessPiece {
    public Advisor(int player, Colour c){
        this.isDead = false;
        this.position = position;
        this.player = player;
        this.c = c;
    }
    public List<int[]> getMovable(int x, int y) {
        List<int[]> list = new ArrayList<int[]>();
        int arr[][] = {{x+1,y+1},{x+1,y-1},{x-1,y+1},{x-1,y-1}};
        for (int ar[]: arr) {
            list.add(ar);
        }
        //for(int[] arr1 : list) {
        //    System.out.println(Arrays.toString(arr1));
        //}
        return list;
    }
}
