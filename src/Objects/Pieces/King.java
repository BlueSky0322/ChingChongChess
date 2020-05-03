package Objects.Pieces;
import Objects.Colour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class King extends ChessPiece {
    private boolean isBeingChecked;
    public King(int player, Colour c){
        this.isDead = false;
        this.position = position;
        this.player = player;
        this.isBeingChecked = false;
        this.c = c;
    }


    @Override
    public List<int[]> getMovable(int x,int y) {
        List<int[]> list = new ArrayList<int[]>();
        int arr[][] = {{x+1,y},{x-1,y},{x,y+1},{x,y-1}};
        for (int ar[]: arr) {
            list.add(ar);
        }
        //for(int[] arr1 : list) {
        //    System.out.println(Arrays.toString(arr1));
        //}
        return list;
    }
}
