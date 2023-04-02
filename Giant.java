import java.awt.*;

public class Giant extends Critter {
    private int moves;
    
    public Giant() {
        moves = 0;
    }
    
    public Action getMove(CritterInfo info) {
        moves++;
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
    
    public Color getColor() {
        return Color.GRAY;
    }
    
    public String toString() {
        if (moves / 6 == 0) {
            return "fee";
        } else if (moves / 6 == 1) {
            return "fie";
        } else if (moves / 6 == 2) {
            return "foe";
        } else {
            return "fum";
        }
    }
}