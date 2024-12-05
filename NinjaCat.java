import java.awt.Color;

/**
 * NinjaCat类代表忍者猫，继承自Critter类。
 * 忍者猫具有独特的行为和颜色。
 */
public class NinjaCat extends Critter {
    private int moveCount = 0;

    /**
     * NinjaCat类的构造函数。
     */
    public NinjaCat() {
        super();
    }

    /**
     * 获取忍者猫的颜色。
     * @return 随机选择红色或蓝色。
     */
    @Override
    public Color getColor() {
        // 每次移动时交替颜色
        return (moveCount++ % 2 == 0) ? Color.RED : Color.BLUE;
    }

    /**
     * 表示忍者猫的字符串形式。
     * @return 固定字符串"NC"。
     */
    @Override
    public String toString() {
        return "NC";
    }

    /**
     * 根据CritterInfo信息决定忍者猫的下一步行动。
     * @param info 提供当前状态的CritterInfo对象。
     * @return 忍者猫随机选择感染、跳跃或转向。
     */
    @Override
    public Action getMove(CritterInfo info) {
        // 随机选择一个行动
        int actionChoice = (int) (Math.random() * 3);
        switch (actionChoice) {
            case 0:
                return Action.INFECT;
            case 1:
                return Action.HOP;
            default:
                return Action.LEFT;
        }
    }
}