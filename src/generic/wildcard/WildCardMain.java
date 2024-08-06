package generic.wildcard;

import generic.animal.Animal;
import generic.animal.Dog;
import generic.ex2.Box;

public class WildCardMain {
    public static void main(String[] args) {
        Box<Dog> dogBox = new Box<>();
        dogBox.set(new Dog("멍멍이", 20));

        Box<Animal> animalBox = new Box<>();
        animalBox.set(new Animal("동물", 10));

        Box<? extends Animal> box1 = dogBox;
        getBox(box1);

        Box<? super Animal> box2 = animalBox;
        writeBox(box2);
    }

    static Animal getBox(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("animal.toString() = " + animal.toString());
        return animal;
    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍이", 20));
    }
}
