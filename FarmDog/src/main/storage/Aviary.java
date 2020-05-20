package storage;

import entity.Dog;

import java.util.ArrayList;
import java.util.List;

public class Aviary {
    private static final String DOG_IN_THE_AVIARY = "Dog in the aviary!";
    private static final String DOG_GO_OUT = "Dog go out! ";
    private List<Dog> dogs;

    public Aviary(List<Dog> dogs) {
        this.dogs = new ArrayList<>(dogs);
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void setDogs(List<Dog> dogs) {
        this.dogs = dogs;
    }

    public void add(Dog dog) {
        dogs.add(dog);
        System.out.println(DOG_IN_THE_AVIARY);
    }

    public void remove(Dog dog) {
        dogs.remove(dog);
        System.out.println(DOG_GO_OUT);
    }

}
