package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMainV3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 20);
        Cat cat = new Cat("야옹이", 15);

        ComplexBox<Dog> dogBox = new ComplexBox<>();
        dogBox.setAnimal(dog);

        Cat cat1 = dogBox.printAndReturn(cat);
        System.out.println(cat1.getName());
    }
}
