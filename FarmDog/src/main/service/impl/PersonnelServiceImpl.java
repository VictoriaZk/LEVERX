package service.impl;

import entity.Dog;
import service.PersonnelService;

import static constants.DogConstants.*;

public class PersonnelServiceImpl implements PersonnelService {
    private static final Integer YOUNG_AGE = 2;
    private static final Integer ADULT_AGE = 6;

    @Override
    public void feed(Dog dog) {
        if (dog.isHungry()) {
            if (dog.getAge() < YOUNG_AGE) {
                dog.setHungry(false);
                System.out.println(YOUNG_FEED.getFieldName());
            } else if (dog.getAge() > YOUNG_AGE && dog.getAge() < ADULT_AGE) {
                dog.setHungry(false);
                System.out.println(AVERAGE_FEED.getFieldName());
            } else {
                dog.setHungry(false);
                System.out.println(ADULT_FEED.getFieldName());
            }
        } else {
            System.out.println(NOT_HUNGRY.getFieldName());
        }
    }

    @Override
    public void wash(Dog dog) {
        if (dog.isDirty()) {
            dog.setDirty(false);
            System.out.println(WASHED.getFieldName());
        } else {
            System.out.println(CLEAN_DOG.getFieldName());
        }
    }
}
