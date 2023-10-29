package Lab_4;
public class HumanTest {
    public static void main(String[] args) {
        // Создаем объекты частей тела человека
        Head head = new Head("Каштановый", 2);
        Leg leftLeg = new Leg(80);
        Leg rightLeg = new Leg(80);
        Hand leftHand = new Hand(5);
        Hand rightHand = new Hand(5);

        // Создаем объект человека
        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);

        // Выводим информацию о частях тела человека
        person.getBodyInfo();
    }
}