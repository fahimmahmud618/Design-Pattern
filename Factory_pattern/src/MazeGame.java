public class MazeGame {
    public Maze MakeMaze()
    {
        return new Maze();
    }
    public Room MakeRoom(int n)
    {
        return new Room(n);
    }

    public Wall MakeWall()
    {
        return new Wall();
    }

    public Door MakeDoor(Room r1, Room r2)
    {
        return new Door(r1,r2);
    }

    public Maze CreateMAze()
    {
        Maze maze = MakeMaze();

        Room room1 = MakeRoom(1);
        Room room2 = MakeRoom(2);
        Door door = MakeDoor(room1,room2);

        maze.AddRoom(room1);
        maze.AddRoom(room2);

        room1.SetSide("North",MakeWall());
        room1.SetSide("East",door);
        room1.SetSide("South",MakeWall());
        room1.SetSide("West",MakeWall());

        room2.SetSide("North",MakeWall());
        room2.SetSide("East",MakeWall());
        room2.SetSide("South",MakeWall());
        room2.SetSide("West",door);

        return maze;
    }
}
