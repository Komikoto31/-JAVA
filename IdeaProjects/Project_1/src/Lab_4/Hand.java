package Lab_4;
class Hand {
    private int fingerCount; // Количество пальцев на руке

    // Конструктор для создания объекта руки
    public Hand(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    // Метод для получения количества пальцев на руке
    public int getFingerCount() {
        return fingerCount;
    }
}
