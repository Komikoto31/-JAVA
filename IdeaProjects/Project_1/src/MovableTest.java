public class MovableTest {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        MovablePoint point = new MovablePoint(2, 2, 2, 2);
        MovableRectangle rectangle = new MovableRectangle(1, 1, 4, 4, 3, 3);

        System.out.println("Original Circle: " + circle);
        System.out.println("Original Point: " + point);
        System.out.println("Original Rectangle: " + rectangle);

        // Moving objects
        circle.moveUp();
        point.moveRight();
        rectangle.moveDown();

        System.out.println("\nAfter moving:");
        System.out.println("Circle: " + circle);
        System.out.println("Point: " + point);
        System.out.println("Rectangle: " + rectangle);
    }
}