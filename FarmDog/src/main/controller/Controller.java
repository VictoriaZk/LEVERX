package controller;

import entity.Command;
import entity.Dog;
import service.DoctorService;
import service.PersonnelService;
import service.TrainerService;
import service.impl.DoctorServiceImpl;
import service.impl.PersonnelServiceImpl;
import service.impl.TrainerServiceImpl;
import storage.Aviary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {
    private static final String GO_TO_SLEEP = "Go to sleep! ";
    private static final String START_A_NEW_DAY = "Start a new day  ";
    private static final String GO_TO_WORK_IN_THE = "Go to work in the ";

    public static void main(String[] args) {
        Random random = new Random();
        PersonnelService personnelService = new PersonnelServiceImpl();
        TrainerService trainerService = new TrainerServiceImpl();
        DoctorService doctorService = new DoctorServiceImpl();

        DogController dogController = new DogController();
        List<Dog> dogs = new ArrayList<>(dogController.getDogs());
        Aviary aviary = new Aviary(dogs);
        CommandController commandController = new CommandController();
        List<Command> commands = new ArrayList<>(commandController.getCommands());


        for (Dog dog : dogs) {
            System.out.println(START_A_NEW_DAY + dog.getName() + "!");
            aviary.remove(dog);
            personnelService.feed(dog);
            personnelService.wash(dog);
            doctorService.treat(dog);
            trainerService.train(dog, commands.get(random.nextInt(commands.size())));
            trainerService.train(dog, commands.get(random.nextInt(commands.size())));
            System.out.println(GO_TO_WORK_IN_THE + dog.getPlaceOfWork());
            personnelService.feed(dog);
            aviary.add(dog);
            System.out.println(GO_TO_SLEEP);
            System.out.println("---------");
        }

    }
}
