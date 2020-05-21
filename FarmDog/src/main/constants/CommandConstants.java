package constants;


public enum CommandConstants {
    COMMAND("command"),
    SIT("sit"),
    GIVE_PAW("give a paw"),
    LAY( "lay"),
    VOICE ("voice");

    private String fieldName;

    CommandConstants(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName(){
        return fieldName;
    }
}
