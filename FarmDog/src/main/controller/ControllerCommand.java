package controller;

import builder.Builder;
import builder.BuilderFactory;
import entity.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*status "TRUE" if command is possible for learn
status "FALSE if command can not learnt right now
 */
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
        this.commands = new ArrayList<>();
        this.commands.add((Command) builder.build(Arrays.asList(SIT, FALSE)));
        this.commands.add((Command) builder.build(Arrays.asList(SIT, TRUE)));
        this.commands.add((Command) builder.build(Arrays.asList(GIVE_PAW, TRUE)));
        this.commands.add((Command) builder.build(Arrays.asList(GIVE_PAW, FALSE)));
        this.commands.add((Command) builder.build(Arrays.asList(LAY, TRUE)));
        this.commands.add((Command) builder.build(Arrays.asList(LAY, FALSE)));
        this.commands.add((Command) builder.build(Arrays.asList(VOICE, TRUE)));
        this.commands.add((Command) builder.build(Arrays.asList(VOICE, FALSE)));
    }

    public List<Command> getCommands() {
        return commands;
    }
}
