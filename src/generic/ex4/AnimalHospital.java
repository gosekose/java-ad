package generic.ex4;

import generic.animal.Animal;

public class AnimalHospital {

    public static <T extends Animal> void checkUp(T animal) {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
    }

    public static <T extends Animal> T bigger(T animal, T other) {
        if (animal.getSize() > other.getSize()) {
            return animal;
        } else {
            return other;
        }
    }
}
