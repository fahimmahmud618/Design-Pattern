public class BombedMazeGame extends MazeGame{
    @Override
    public Wall MakeWall() {
        return new BombedWall();
    }

    @Override
    public Room MakeRoom(int n) {
        return new RoomWithBomb(n);
    }
}
