class Animal {
    public void makeNoise() {
        System.out.println("The animal makes a sound.");
    }

    public void roam() {
        System.out.println("The animal roams around.");
    }

    public void sleep() {
        System.out.println("The animal sleeps.");
    }
}

// Feline family
class Feline extends Animal {
    @Override
    public void roam() {
        System.out.println("The feline prowls silently.");
    }
}

class Cat1 extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("The cat says: Meow!");
    }
}

class Lion1 extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("The lion says: Roar!");
    }
}

// Canine family
class Canine extends Animal {
    @Override
    public void roam() {
        System.out.println("The canine roams in a pack.");
    }
}

class Dog1 extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("The dog says: Bark!");
    }
}

class Wolf1 extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("The wolf says: Howl!");
    }
}

public class task4 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat1(),
                new Dog1(),
                new Lion1(),
                new Wolf1()
        };

        for (Animal animal : animals) {
            animal.makeNoise();
            animal.roam();
            animal.sleep();
            System.out.println("---");
        }
    }
}
