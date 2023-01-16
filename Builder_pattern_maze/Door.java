package Builder_pattern_maze;

public class Door implements MazeItem{
    @Override
    public String itemName() {
        return null;
    }

    @Override
    public Color colorName() {
        return new RedColor();
    }

    @Override
    public int area() {
        return 0;
    }
}
