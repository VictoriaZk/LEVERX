package entity;


import java.util.Objects;

public class Command {
    private String name;
    private boolean status;

    public Command(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Command command = (Command) o;
        return status == command.status &&
                Objects.equals(name, command.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, status);
    }
}
