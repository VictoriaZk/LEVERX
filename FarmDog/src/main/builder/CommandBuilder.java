package builder;

import entity.Command;

import java.util.List;

public class CommandBuilder implements Builder<Command> {

    @Override
    public Command build(List<String> parameters) {
        String name = parameters.get(0);
        Boolean status = Boolean.parseBoolean(parameters.get(1));
        return new Command(name, status);
    }
}
