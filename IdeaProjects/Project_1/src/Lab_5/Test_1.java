package Lab_5;
public class Test_1 {
    public static void main(String[] arg){
        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
        System.out.println(s1); // which version?
        System.out.println(s1.getArea()); // which version?
        System.out.println(s1.getPerimeter()); // which version?
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); // не работает, потому что переменная s1 имеет тип Shape, а метод getRadius() определен только в классе Circle, который является подклассом Shape.
        Circle c1 = (Circle)s1; // downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
         // Shape это абстрактный класс, мы не можем создать объект у такого класса
        Shape s3 = new Rectangle("RED", false, 1.0, 2.0); // Поля в неправильном порядке
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());

        System.out.println(((Rectangle) s3).getLength()); // не работает, потому что переменная s3 имеет тип Shape, и метод getLength() не определен в классе Shape.
        Rectangle r1 = (Rectangle)s3; // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
       System.out.println(r1.getLength());
        Shape s4 = new Square(6.6); // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        System.out.println(((Square) s4).getSide()); //  не работает, потому что переменная s4 имеет тип Shape, и метод getSide() не определен в классе Shape.


        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
         //  не работает, потому что переменная s4 имеет тип Shape, и метод getSide() не определен в классе Shape.
        System.out.println(r2.getLength());


        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

    }

}
