import java.awt.*;

public class WhiteTiger extends Critter {
    private int moves;
    private boolean hasInfected;
    
    public WhiteTiger() {
        moves = 0;
        hasInfected = false;
    }
    
    public Action getMove(CritterInfo info) {
        moves++;
        if (info.getFront() == Neighbor.OTHER) {
            hasInfected = true;
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
        return Color.WHITE;
    }
    
    public String toString() {
        if (hasInfected) {
            return "TGR";
        } else {
            return "tgr";
        }
    }
}