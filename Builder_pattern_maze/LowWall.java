package Builder_pattern_maze;

public class LowWall extends Wall{
    @Override
    public String itemName() {
        return "Low Wall";
    }

    @Override
    public int area() {
        return 2;
    }
}
