class Animal1 {
    public void makeNoise() {
        System.out.println("The animal makes a sound.");
    }
}
class Cat extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("The cat says: Meow!");
    }
}
class Dog extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("The dog says: Bark!");
    }
}
class Lion extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("The lion says: Roar!");
    }
}
class Wolf extends Animal {
    @Override
    public void makeNoise() {
        System.out.println("The wolf says: Howl!");
    }
}
public class task3 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Dog(),
                new Lion(),
                new Wolf()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
            System.out.println("---");
        }
    }
}
