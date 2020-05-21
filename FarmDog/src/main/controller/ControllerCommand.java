package controller;

import builder.Builder;
import builder.BuilderFactory;
import constants.CommandConstants;
import entity.Command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static constants.BooleanConstants.FALSE;
import static constants.BooleanConstants.TRUE;

/*status "TRUE" if command is possible for learn
status "FALSE if command can not learnt right now
 */
public class ControllerCommand {
    private List<Command> commands;
    private Builder builder = BuilderFactory.create(CommandConstants.COMMAND.getFieldName());

    public ControllerCommand() {
        this.commands = new ArrayList<>();
        this.commands.add((Command) builder.build(Arrays.asList(CommandConstants.SIT.getFieldName(), FALSE.getFieldName())));
        this.commands.add((Command) builder.build(Arrays.asList(CommandConstants.SIT.getFieldName(), TRUE.getFieldName())));
        this.commands.add((Command) builder.build(Arrays.asList(CommandConstants.GIVE_PAW.getFieldName(), TRUE.getFieldName())));
        this.commands.add((Command) builder.build(Arrays.asList(CommandConstants.GIVE_PAW.getFieldName(), FALSE.getFieldName())));
        this.commands.add((Command) builder.build(Arrays.asList(CommandConstants.LAY.getFieldName(), TRUE.getFieldName())));
        this.commands.add((Command) builder.build(Arrays.asList(CommandConstants.LAY.getFieldName(), FALSE.getFieldName())));
        this.commands.add((Command) builder.build(Arrays.asList(CommandConstants.VOICE.getFieldName(), TRUE.getFieldName())));
        this.commands.add((Command) builder.build(Arrays.asList(CommandConstants.GIVE_PAW.getFieldName(), FALSE.getFieldName())));
    }

    public List<Command> getCommands() {
        return commands;
    }
}
