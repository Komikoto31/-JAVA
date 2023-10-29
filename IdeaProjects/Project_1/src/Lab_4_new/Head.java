package Lab_4_new;
class Head {
    private String hairColor; // Цвет волос
    private int eyeCount;     // Количество глаз

    // Конструктор для создания объекта головы
    public Head(String hairColor, int eyeCount) {
        this.hairColor = hairColor;
        this.eyeCount = eyeCount;
    }

    // Метод для получения цвета волос
    public String getHairColor() {
        return hairColor;
    }

    // Метод для получения количества глаз
    public int getEyeCount() {
        return eyeCount;
    }
}