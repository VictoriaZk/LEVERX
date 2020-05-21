package constants;

public enum DogConstants {
    DOG("dog"),
    TREATED ("Dog is treated!"),
    HEALTHY("Dog is healthy!"),
    YOUNG_FEED("Dog eat feed for little dogs"),
    AVERAGE_FEED ("Dog eat feed for average dogs"),
    ADULT_FEED("Dog eat feed for adult dogs"),
    NOT_HUNGRY ("Dog is not hungry!"),
    WASHED("Dog is washed!"),
    CLEAN_DOG("Dog is clean!"),
    NO_TRAIN ("Dog do not need to train !"),
    DOG_IN_THE_AVIARY("Dog in the aviary!"),
    DOG_GO_OUT("Dog go out! "),
    DOG_CAN_NOT_LEARN_THIS_COMMAND("Dog can not learn this command!"),
    DOG_IS_LEARNED_NOW_COMMAND("Dog is learned a new command ");

    private String fieldName;

    DogConstants(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName(){
        return fieldName;
    }
}
