package Lab_9;

// Класс, представляющий машину
class Car implements Nameable {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getName() {
        return brand;
    }
}
