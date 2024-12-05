import java.awt.Color;

public class Bear extends Critter {
    public int moveCount;
    private boolean polar;
    public Bear(boolean polar) {
        super();
        this.polar = polar;
    }

    @Override
    public Color getColor() {
        return polar ? Color.WHITE : Color.BLACK;
    }

    @Override
    public String toString() {
        return moveCount % 2 == 0 ? "/" : "\\";
    }


    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }
}