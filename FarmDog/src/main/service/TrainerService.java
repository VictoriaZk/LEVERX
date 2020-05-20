package service;

import entity.Command;
import entity.Dog;

public interface TrainerService {
    void train(Dog dog, Command command);
}
