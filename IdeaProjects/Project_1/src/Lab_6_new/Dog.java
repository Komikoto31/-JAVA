package Lab_6_new;
abstract class Dog {
    private String name;
    private int age;

    // Конструктор
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Абстрактный метод для издания звука (лай) собаки
    public abstract void bark();

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
