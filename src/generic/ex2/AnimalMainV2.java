package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMainV2 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 10);
        Dog dog = new Dog("멍멍이", 20);
        Cat cat = new Cat("야옹이", 15);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);
    }
}
