package Lab_4_new;
class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    // Конструктор для создания объекта человека с указанием характеристик частей тела
    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }

    // Метод для получения информации о частях тела человека
    public void getBodyInfo() {
        System.out.println("Информация о теле человека:");
        System.out.println("Цвет волос: " + head.getHairColor());
        System.out.println("Количество глаз: " + head.getEyeCount());
        System.out.println("Длина левой ноги: " + leftLeg.getLength() + " см");
        System.out.println("Длина правой ноги: " + rightLeg.getLength() + " см");
        System.out.println("Количество пальцев на левой руке: " + leftHand.getFingerCount());
        System.out.println("Количество пальцев на правой руке: " + rightHand.getFingerCount());
    }
}