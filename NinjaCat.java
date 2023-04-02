import java.awt.*;

public class NinjaCat extends Critter {
    private int moves;
    
    public NinjaCat() {
        moves = 0;
    }
    
    public Action getMove(CritterInfo info) {
        moves++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            if (info.getRight() == Neighbor.EMPTY) {
                return Action.RIGHT;
            } else if (info.getLeft() == Neighbor.EMPTY) {
                return Action.LEFT;
            } else {
                return Action.RIGHT;
            }
        }
    }
    
    public Color getColor() {
        // You decide
        return Color.YELLOW;
    }
    
    public String toString() {
        // You decide
        return "N";
    }
}