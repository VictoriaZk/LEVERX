package storage;

import entity.Command;
import entity.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static constants.DogConstants.DOG_CAN_NOT_LEARN_THIS_COMMAND;
import static constants.DogConstants.DOG_IS_LEARNED_NOW_COMMAND;


public class LearnedCommands {
    private static Map<Dog, List<Command>> learnedCommands = new HashMap<>();

    public static void add(Dog dog, Command command) {
        if (command.isStatus()) {
            command.setStatus(false);
            learnedCommands.get(dog).add(command);
            System.out.println(DOG_IS_LEARNED_NOW_COMMAND.getFieldName() + command.getName());
        } else {
            System.out.println(DOG_CAN_NOT_LEARN_THIS_COMMAND.getFieldName());
        }
    }

    public static boolean isCommandLearned(Dog dog, Command command) {
        if (learnedCommands.containsKey(dog)) {
            return learnedCommands.get(dog).contains(command);
        } else {
            learnedCommands.put(dog, new ArrayList<>());
            return false;
        }
    }

}
