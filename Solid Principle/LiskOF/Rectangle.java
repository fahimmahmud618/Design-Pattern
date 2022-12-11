public class Rectangle implements Shape{
    private float height, width;

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String draw() {
        return "This is a rectangle";
    }

    @Override
    public float getArea() {
        return height*width;
    }
}
