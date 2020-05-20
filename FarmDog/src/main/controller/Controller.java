package controller;

import storage.Aviary;
import entity.Command;
import entity.Dog;
import service.DoctorService;
import service.PersonnelService;
import service.TrainerService;
import service.impl.DoctorServiceImpl;
import service.impl.PersonnelServiceImpl;
import service.impl.TrainerServiceImpl;
import storage.LearnedCommands;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    public static void main(String[] args) {
        PersonnelService personnelService = new PersonnelServiceImpl();
        TrainerService trainerService = new TrainerServiceImpl();
        DoctorService doctorService = new DoctorServiceImpl();

        ControllerDog controllerDog = new ControllerDog();
        List<Dog> dogs = new ArrayList<>(controllerDog.getDogs());
        Aviary aviary = new Aviary(dogs);
        ControllerCommand controllerCommand = new ControllerCommand();
        List<Command> commands = new ArrayList<>(controllerCommand.getCommands());
        LearnedCommands.add(dogs.get(2), commands.get(3));
        

        for (Dog dog : dogs) {
            System.out.println("Start a new day for " + dog.getName() + "!");
            aviary.remove(dog);
            personnelService.feed(dog);
            personnelService.wash(dog);
            doctorService.treat(dog);
            trainerService.train(dog, commands);
            System.out.println("Go to work in the " + dog.getPlaceOfWork());
            personnelService.feed(dog);
            aviary.add(dog);
            System.out.println("Go to sleep! ");
            System.out.println( "---------");
        }

    }
}
