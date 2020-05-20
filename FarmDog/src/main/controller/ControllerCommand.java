package controller;

import builder.Builder;
import builder.BuilderFactory;
import entity.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ControllerCommand {
    private static final String SIT = "sit";
    private static final String GIVE_PAW = "give a paw";
    private static final String LAY = "lay";
    private static final String VOICE = "voice";
    private static final String FALSE = "false";
    private static final String TRUE = "true";
    private List<Command> commands;
    private Builder builder = BuilderFactory.create("command");

    public ControllerCommand() {
        commands = new ArrayList<>();
        commands.add((Command) builder.build(Arrays.asList(SIT, FALSE)));
        commands.add((Command) builder.build(Arrays.asList(SIT, TRUE)));
        commands.add((Command) builder.build(Arrays.asList(GIVE_PAW, TRUE)));
        commands.add((Command) builder.build(Arrays.asList(GIVE_PAW, FALSE)));
        commands.add((Command) builder.build(Arrays.asList(LAY, TRUE)));
        commands.add((Command) builder.build(Arrays.asList(LAY, FALSE)));
        commands.add((Command) builder.build(Arrays.asList(VOICE, TRUE)));
        commands.add((Command) builder.build(Arrays.asList(VOICE, FALSE)));
    }

    public List<Command> getCommands() {
        return commands;
    }
}
