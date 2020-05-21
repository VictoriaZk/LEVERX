package controller;

import builder.Builder;
import builder.BuilderFactory;
import constants.BooleanConstants;
import constants.DogConstants;
import entity.Dog;
import entity.Job;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static constants.BooleanConstants.FALSE;
import static constants.BooleanConstants.TRUE;

public class DogController {
    private List<Dog> dogs;
    private Builder builder = BuilderFactory.create(DogConstants.DOG.getFieldName());

    public DogController() {
        this.dogs = new ArrayList<>();
        this.dogs.add((Dog) builder.build(Arrays.asList("John", "8", TRUE.getFieldName(), TRUE.getFieldName(),
                TRUE.getFieldName(), FALSE.getFieldName(), Job.POLICE.getJob())));
        this.dogs.add((Dog) builder.build(Arrays.asList("Petty", "2", FALSE.getFieldName(), FALSE.getFieldName(),
                TRUE.getFieldName(), TRUE.getFieldName(), Job.MEDICINE.getJob())));
        this.dogs.add((Dog) builder.build(Arrays.asList("Laly", "6", TRUE.getFieldName(), FALSE.getFieldName(),
                TRUE.getFieldName(), TRUE.getFieldName(), Job.SHOW.getJob())));
        this.dogs.add((Dog) builder.build(Arrays.asList("Lily", "1", FALSE.getFieldName(), FALSE.getFieldName(),
                FALSE.getFieldName(), FALSE.getFieldName(), Job.NONE.getJob())));
        this.dogs.add((Dog) builder.build(Arrays.asList("Tanya", "1", TRUE.getFieldName(), TRUE.getFieldName(),
                TRUE.getFieldName(), TRUE.getFieldName(), Job.NONE.getJob())));
    }

    public List<Dog> getDogs() {
        return dogs;
    }
}
