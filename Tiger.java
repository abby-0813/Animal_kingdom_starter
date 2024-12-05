import java.awt.Color;

public class Tiger extends Critter {
    private int moveCount = 0;
    private Color currentColor;
    public Tiger() {
        super();
        changeColor();
    }

    @Override
    public Color getColor() {
        if (moveCount % 3 == 0) changeColor();
        return currentColor;
    }

    private void changeColor() {
        currentColor = Color.white;
    }

    @Override
    public String toString() {
        return "TGR";
    }

    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }
}