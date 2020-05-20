package storage;

import entity.Command;
import entity.Dog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LearnedCommands {
    private static Map<Dog, List<Command>> learnedCommands = new HashMap<>();

    public static void add(Dog dog, Command command){
        if(learnedCommands.containsKey(dog)) {
            learnedCommands.get(dog).add(command);
        }
        else{
            learnedCommands.put(dog, new ArrayList<>());
        }
    }

    public static boolean isCommandLearned(Dog dog, Command command){
        return learnedCommands.get(dog).contains(command);
    }

}
