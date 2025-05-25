public class AnimalHierarchy {

    static class Animal {
        public void sleep() {
            System.out.println("The animal is sleeping.");
        }

        public void makeNoise() {
            System.out.println("The animal makes a noise.");
        }

        public void roam() {
            System.out.println("The animal is roaming.");
        }
    }

    static class Feline extends Animal {
        @Override
        public void roam() {
            System.out.println("The feline prowls silently.");
        }
    }

    static class Canine extends Animal {
        @Override
        public void roam() {
            System.out.println("The canine roams in packs.");
        }
    }

    static class Lion extends Feline {
        @Override
        public void makeNoise() {
            System.out.println("The lion roars.");
        }
    }

    static class Cat extends Feline {
        @Override
        public void makeNoise() {
            System.out.println("The cat meows.");
        }
    }

    static class Wolf extends Canine {
        @Override
        public void makeNoise() {
            System.out.println("The wolf howls.");
        }
    }

    static class Dog extends Canine {
        @Override
        public void makeNoise() {
            System.out.println("The dog barks.");
        }
    }

    public static void main(String[] args) {
        Animal[] animals = {
            new Lion(),
            new Cat(),
            new Wolf(),
            new Dog()
        };

        for (Animal animal : animals) {
            System.out.println("Class: " + animal.getClass().getSimpleName());
            animal.makeNoise();
            animal.sleep();
            animal.roam();
            System.out.println("------");
        }
    }
}
