package controller;

import builder.Builder;
import builder.BuilderFactory;
import entity.Dog;
import entity.Job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControllerDog {
    private static final String FALSE = "false";
    private static final String TRUE = "true";
    private List<Dog> dogs;
    private Builder builder = BuilderFactory.create("dog");

    public ControllerDog() {
        this.dogs = new ArrayList<>();
        this.dogs.add((Dog) builder.build(Arrays.asList("John", "8", TRUE, TRUE, TRUE, FALSE, Job.POLICE.toString())));
        this.dogs.add((Dog) builder.build(Arrays.asList("Petty", "2", FALSE, FALSE, TRUE, TRUE, Job.MEDICINE.toString())));
        this.dogs.add((Dog) builder.build(Arrays.asList("Laly", "6", TRUE, FALSE, TRUE, TRUE, Job.SHOW.toString())));
        this.dogs.add((Dog) builder.build(Arrays.asList("Lily", "1", FALSE, FALSE, FALSE, FALSE, Job.NONE.toString())));
        this.dogs.add((Dog) builder.build(Arrays.asList("Tanya", "1", TRUE, TRUE, TRUE, TRUE, Job.NONE.toString())));

    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
