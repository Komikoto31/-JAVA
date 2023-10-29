package Lab_6_new;

class Chair extends Furniture {
    public Chair(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Стул";
    }
}
