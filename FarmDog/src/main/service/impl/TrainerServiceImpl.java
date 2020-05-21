package service.impl;

import entity.Command;
import entity.Dog;
import service.TrainerService;
import storage.LearnedCommands;

import static constants.DogConstants.NO_TRAIN;

public class TrainerServiceImpl implements TrainerService {

    public void train(Dog dog, Command command) {
        if (dog.isTrained() && !LearnedCommands.isCommandLearned(dog, command)) {
            LearnedCommands.add(dog, command);
        } else {
            System.out.println(NO_TRAIN.getFieldName());
        }
    }
}
