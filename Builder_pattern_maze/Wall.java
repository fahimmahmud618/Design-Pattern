package Builder_pattern_maze;

public class Wall implements MazeItem{
    @Override
    public String itemName() {
        return null;
    }

    @Override
    public Color colorName() {
        return new GreenColor();
    }

    @Override
    public int area() {
        return 0;
    }
}
