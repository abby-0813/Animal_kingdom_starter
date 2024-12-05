import java.awt.Color;

/**
 * Giant类代表巨人，继承自Critter类。
 * 根据移动步数，巨人会改变其表示的字符串。
 */
public class Giant extends Critter {
    public int moveCount;

    /**
     * Giant类的构造函数。
     */
    public Giant() {
        super();
    }

    /**
     * 获取巨人的颜色。
     * @return 始终返回灰色。
     */
    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    /**
     * 表示巨人的字符串形式。
     * 每6步更换一次字符串，依次为"fee"、"fie"、"foe"、"fum"。
     * @return 表示字符串。
     */
    @Override
    public String toString() {
        switch (moveCount / 6 % 4) {
            case 0: return "fee";
            case 1: return "fie";
            case 2: return "foe";
            default: return "fum";
        }
    }

    /**
     * 根据CritterInfo信息决定巨人的下一步行动。
     * @param info 提供当前状态的CritterInfo对象。
     * @return 根据周围环境选择行动：感染、跳跃或右转。
     */
    @Override
    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }
}