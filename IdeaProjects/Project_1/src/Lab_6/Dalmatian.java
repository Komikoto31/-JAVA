package Lab_6;

class Dalmatian extends Dog {
    public Dalmatian(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " лает: Вау-вау!");
    }
}
