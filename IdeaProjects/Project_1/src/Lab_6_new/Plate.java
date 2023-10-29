package Lab_6_new;
class Plate extends Dish {
    private boolean isClean;

    public Plate(String material, int capacity, boolean isClean) {
        super(material, capacity);
        this.isClean = isClean;
    }

    @Override
    public void displayInfo() {
        System.out.println("Тарелка изготовлена из " + getMaterial() + ", ее вместимость: " + getCapacity() + " мл.");
        if (isClean) {
            System.out.println("Тарелка чистая.");
        } else {
            System.out.println("Тарелка грязная.");
        }
    }
}
