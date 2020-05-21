package constants;

public enum BooleanConstants {
    TRUE("true"),
    FALSE("false");

    private String fieldName;

    BooleanConstants(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldName(){
        return fieldName;
    }
}
