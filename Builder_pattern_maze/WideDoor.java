package Builder_pattern_maze;

public class WideDoor extends Door{
    @Override
    public String itemName() {
        return "Wide Door";
    }

    @Override
    public int area() {
        return 10;
    }
}
