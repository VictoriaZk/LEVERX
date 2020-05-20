package builder;

public class BuilderFactory {
    private static final String DOG = "dog";
    private static final String COMMAND = "command";

    public static Builder create(String builderName) {

        switch (builderName) {
            case DOG: {
                return new DogBuilder();
            }
            case COMMAND: {
                return new CommandBuilder();
            }
            default:
                throw new IllegalArgumentException("Unknown Builder name!");
        }
    }
}
