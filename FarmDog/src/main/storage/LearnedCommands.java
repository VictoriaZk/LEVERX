package storage;

import entity.Command;
import entity.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LearnedCommands {
    private static final String DOG_CAN_NOT_LEARN_THIS_COMMAND = "Dog can not learn this command!";
    private static final String DOG_IS_LEARNED_NOW_COMMAND = "Dog is learned a new command ";
    private static Map<Dog, List<Command>> learnedCommands = new HashMap<>();

    public static void add(Dog dog, Command command) {
        if (command.isStatus()) {
            command.setStatus(false);
            learnedCommands.get(dog).add(command);
            System.out.println(DOG_IS_LEARNED_NOW_COMMAND + command.getName());
        } else {
            System.out.println(DOG_CAN_NOT_LEARN_THIS_COMMAND);
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
