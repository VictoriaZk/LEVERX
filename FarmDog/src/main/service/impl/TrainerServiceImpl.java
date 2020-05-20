package service.impl;

import entity.Command;
import entity.Dog;
import service.TrainerService;

import java.util.List;

public class TrainerServiceImpl implements TrainerService {
    private static final String NO_TRAIN = "Dog can not training now!";

    public void train(Dog dog, List<Command> commands) {
        if (dog.isTrained()) {
            commands.stream().map(Command::isStatus)
                    .filter(s -> !s)
                    .findAny()
                    .orElseThrow(() -> new RuntimeException("All commands are trained!"));
            //не работает
        } else {
            System.out.println(NO_TRAIN);
        }
    }
}
