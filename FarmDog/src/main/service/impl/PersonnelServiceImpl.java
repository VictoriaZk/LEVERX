package service.impl;

import entity.Dog;
import service.PersonnelService;

public class PersonnelServiceImpl implements PersonnelService {
    private static final String YOUNG_FEED = "feed for little dogs";
    private static final String AVERAGE_FEED = "feed for average dogs";
    private static final String ADULT_FEED = "feed for adult dogs";
    private static final String NOT_HUNGRY = "Dog is not hungry!";
    private static final String WASHED = "Dog is washed!";
    private static final String CLEAN_DOG = "Dog is clean!";
    private static final Integer YOUNG_AGE = 2;
    private static final Integer ADULT_AGE = 6;

    @Override
    public void feed(Dog dog) {
        if (dog.isHungry()) {
            if (dog.getAge() < YOUNG_AGE) {
                dog.setHungry(false);
                System.out.println(YOUNG_FEED);
            } else if (dog.getAge() > YOUNG_AGE && dog.getAge() < ADULT_AGE) {
                dog.setHungry(false);
                System.out.println(AVERAGE_FEED);
            } else {
                dog.setHungry(false);
                System.out.println(ADULT_FEED);
            }
        } else {
            System.out.println(NOT_HUNGRY);
        }
    }

    @Override
    public void wash(Dog dog) {
        if (dog.isDirty()) {
            dog.setDirty(false);
            System.out.println(WASHED);
        }
        else{
            System.out.println(CLEAN_DOG);
        }
    }
}
