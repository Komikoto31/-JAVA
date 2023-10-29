package Lab_3;

public class Ball1 {private double x = 0.0;
    private double y = 0.0;
    public Ball1(){}
    public Ball1(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y){ // положение мяча на поле
        this.x = x;
        this.y = y;
    }
    public void move( double xDisp, double yDisp){ // скорость мяча
        x+=xDisp;
        y+=yDisp;
    }
    @Override
    public String toString() {
        return "Ball_ @ ("+this.x+", "+this.y+").";
    }
}
