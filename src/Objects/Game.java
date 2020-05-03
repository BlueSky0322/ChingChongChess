package Objects;

public class Game {
    public Game(){
        Board b = new Board();
        b.printBoard();
        b.showAvailableMoves(4,0);
    }
}
