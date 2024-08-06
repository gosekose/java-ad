package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 10);
        Dog dog = new Dog("멍멍이", 20);
        Cat cat = new Cat("야옹이", 15);

        AnimalHospital.checkUp(animal);
        AnimalHospital.checkUp(dog);
        AnimalHospital.checkUp(cat);

        Animal biggerAnimal = AnimalHospital.bigger(dog, cat);
        System.out.println("더 큰 동물은: " + biggerAnimal.getName());
    }
}
