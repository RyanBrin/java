/*
 * Ryan Brinkman
 * Test Rectangle
 * Page 184
 * 11/07/2024
 */

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle none = new Rectangle();
        Rectangle spookly = new Rectangle(4, 5);
        Rectangle bert = new Rectangle(84, 100);
        Rectangle hiddenRoom = new Rectangle(17, 2);

        System.out.println("Dimensions");
        System.out.println("Rectangle 1: " + none.getLength() + "x" + none.getWidth());
        System.out.println("Rectangle 2: " + spookly.getLength() + "x" + spookly.getWidth());
        System.out.println("Rectangle 3: " + bert.getLength() + "x" + bert.getWidth());
        System.out.println("Rectangle 4: " + hiddenRoom.getLength() + "x" + hiddenRoom.getWidth());

        System.out.println();

        System.out.println("Area");
        System.out.println("Rectangle 1: " + none.getArea());
        System.out.println("Rectangle 2: " + spookly.getArea());
        System.out.println("Rectangle 3: " + bert.getArea());
        System.out.println("Rectangle 4: " + hiddenRoom.getArea());

        System.out.println();

        System.out.println("Perimeter");
        System.out.println("Rectangle 1: " + none.getPerimeter());
        System.out.println("Rectangle 2: " + spookly.getPerimeter());
        System.out.println("Rectangle 3: " + bert.getPerimeter());
        System.out.println("Rectangle 4: " + hiddenRoom.getPerimeter());
    }
}