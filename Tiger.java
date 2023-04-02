import java.awt.*;

public class Tiger extends Critter {
    private int moves;
    private Color color;
    
    public Tiger() {
        moves = 0;
        color = generateRandomColor();
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
        return color;
    }
    
    public String toString() {
        if (moves % 3 == 0) {
            return "TGR";
        } else if (moves % 3 == 1) {
            return "tgr";
        } else {
            return "grr";
        }
    }
    
    private Color generateRandomColor() {
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        int blue = (int) (Math.random() * 256);
        return new Color(red, green, blue);
    }
}