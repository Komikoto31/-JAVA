public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    @Override
    public void moveUp() {
        x = x + x * xSpeed;
    }

    @Override
    public void moveDown() {
        x = x - x * xSpeed;
    }

    @Override
    public void moveLeft() {
        y = y - y * ySpeed;
    }

    @Override
    public void moveRight() {
        y = y + y * ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}