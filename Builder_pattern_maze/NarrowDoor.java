package Builder_pattern_maze;

public class NarrowDoor extends Door{
    @Override
    public String itemName() {
        return "Narrow Door";
    }

    @Override
    public int area() {
        return 5;
    }
}
