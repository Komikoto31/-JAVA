package Lab_6_new;

class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Стол";
    }
}
