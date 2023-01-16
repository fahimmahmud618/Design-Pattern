package Builder_pattern_maze;

public class HighWall extends Wall{
    @Override
    public String itemName() {
        return "High Wall";
    }

    @Override
    public int area() {
        return 4;
    }
}
