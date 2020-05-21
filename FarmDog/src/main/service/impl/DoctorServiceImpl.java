package service.impl;

import entity.Dog;
import service.DoctorService;

import static constants.DogConstants.HEALTHY;
import static constants.DogConstants.TREATED;

public class DoctorServiceImpl implements DoctorService {

    @Override
    public void treat(Dog dog) {
        if (!dog.isHealthy()) {
            dog.setHealthy(true);
            System.out.println(TREATED.getFieldName());
        } else {
            System.out.println(HEALTHY.getFieldName());
        }
    }
}
