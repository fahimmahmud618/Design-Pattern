public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.draw());
        r.setHeight(5);
        r.setWidth(4);
        System.out.println("Are of the rectangle is: "+ r.getArea());

        Square s = new Square();
        System.out.println(s.draw());
        s.setHeight(5);
        System.out.println("Are of the square is: "+ s.getArea());
    }
}
