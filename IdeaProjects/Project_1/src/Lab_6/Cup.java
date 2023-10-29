package Lab_6;
class Cup extends Dish {
    private boolean hasHandle;

    public Cup(String material, int capacity, boolean hasHandle) {
        super(material, capacity);
        this.hasHandle = hasHandle;
    }

    @Override
    public void displayInfo() {
        System.out.println("Чашка изготовлена из " + getMaterial() + ", ее вместимость: " + getCapacity() + " мл.");
        if (hasHandle) {
            System.out.println("Чашка имеет ручку.");
        } else {
            System.out.println("Чашка без ручки.");
        }
    }
}