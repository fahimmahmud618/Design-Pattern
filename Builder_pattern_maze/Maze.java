package Builder_pattern_maze;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    public List<MazeItem> mazeItems = new ArrayList<MazeItem>();
    public int t_area=0;
    public void addItem(MazeItem mazeItem) {
        mazeItems.add(mazeItem);
    }

    public int getTotalArea()
    {

        for(MazeItem m : mazeItems)
            t_area = t_area+m.area();

        return  t_area;
    }

    public void showMazeInfo()
    {
        for(MazeItem m: mazeItems)
        {
            System.out.println("Item name: "+m.itemName());
            System.out.println("Color: "+m.colorName().getColor());
            System.out.println("Area: "+m.area());
        }
        System.out.println("Total Area: "+t_area);
    }
}
