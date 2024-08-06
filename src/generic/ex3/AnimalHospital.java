package generic.ex3;

import generic.animal.Animal;

public class AnimalHospital<T extends Animal> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkUp() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
    }

    public T bigger(T animal) {
        if (this.animal.getSize() > animal.getSize()) {
            return this.animal;
        } else {
            return animal;
        }
    }
}
