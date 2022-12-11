public class Square extends Rectangle{
    @Override
    public String draw() {
        return "This is a square";
    }

    @Override
    public void setHeight(float height) {
        super.setHeight(height);
        super.setWidth(height);
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setHeight(width);
    }
}
