package Lab_6;

class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Стул";
    }
}
