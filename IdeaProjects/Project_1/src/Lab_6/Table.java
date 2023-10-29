package Lab_6;

class Table extends Furniture {
    public Table(String name, double price) {
        super(name, price);
    }

    @Override
    public String getType() {
        return "Стол";
    }
}
