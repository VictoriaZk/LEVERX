package service;

import entity.Command;
import entity.Dog;

import java.util.List;

public interface TrainerService {
    void train(Dog dog, List<Command> commands);
}
