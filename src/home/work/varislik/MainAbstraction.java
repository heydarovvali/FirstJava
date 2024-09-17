package home.work.varislik;

public class MainAbstraction {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.makeNoise();
        Animal dog = new Dog();
        dog.makeNoise();
        Animal lion = new Lion();
        lion.makeNoise();
    }
}
