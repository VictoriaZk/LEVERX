package service.impl;

import entity.Command;
import entity.Dog;
import service.TrainerService;
import storage.LearnedCommands;

import java.util.List;

public class TrainerServiceImpl implements TrainerService {
    private static final String NO_TRAIN = "Dog can not training now!";
    public static final String DOG_IS_LEARNED_NOW_COMMAND = "Dog is learned now command";

    public void train(Dog dog, List<Command> commands) {
        if (!dog.isTrained()) {
            Command learningCommand = commands.stream()
                    .filter((command) -> !LearnedCommands.isCommandLearned(dog, command))
                    .findAny()
                    .get();
            LearnedCommands.add(dog, learningCommand);
            System.out.println(DOG_IS_LEARNED_NOW_COMMAND + learningCommand);
        } else {
            System.out.println(NO_TRAIN);
        }
    }
}
