package service.impl;

import entity.Dog;
import service.DoctorService;

public class DoctorServiceImpl implements DoctorService {
    private static final String TREATED = "Dog is treated!";
    private static final String HEALTHY = "Dog is healthy!";

    @Override
    public void treat(Dog dog) {
        if (!dog.isHealthy()) {
            dog.setHealthy(true);
            System.out.println(TREATED);
        } else {
            System.out.println(HEALTHY);
        }

    }
}
