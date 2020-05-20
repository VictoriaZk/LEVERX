package service.impl;

import entity.Command;
import entity.Dog;
import service.TrainerService;
import storage.LearnedCommands;


public class TrainerServiceImpl implements TrainerService {
    private static final String NO_TRAIN = "Dog do not need to train !";

    public void train(Dog dog, Command command) {
        if (dog.isTrained() && !LearnedCommands.isCommandLearned(dog, command)) {
            LearnedCommands.add(dog, command);
        } else {
            System.out.println(NO_TRAIN);
        }
    }
}
