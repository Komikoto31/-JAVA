package Lab_6;
class LabradorRetriever extends Dog {
    public LabradorRetriever(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " лает: Гав-гав!");
    }
}
