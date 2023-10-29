package Lab_6_new;

class Dalmatian extends Dog {
    public Dalmatian(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " лает: Вау-вау!");
    }
}
