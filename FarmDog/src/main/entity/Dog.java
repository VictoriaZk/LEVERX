package entity;

import java.util.Objects;

public class Dog {
    private String name;
    private int age;
    private boolean dirty = false;
    private boolean healthy = false;
    private boolean hungry = true;
    private boolean trained = false;
    private String placeOfWork;

    public Dog(String name, int age, boolean dirty, boolean healthy, boolean hungry,
               boolean trained, String placeOfWork) {
        this.name = name;
        this.age = age;
        this.dirty = dirty;
        this.healthy = healthy;
        this.hungry = hungry;
        this.trained = trained;
        this.placeOfWork = placeOfWork;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isDirty() {
        return dirty;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isHealthy() {
        return healthy;
    }

    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Dog dog = (Dog) o;
        return age == dog.age &&
                dirty == dog.dirty &&
                healthy == dog.healthy &&
                hungry == dog.hungry &&
                trained == dog.trained &&
                Objects.equals(placeOfWork, dog.placeOfWork) &&
                Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, dirty, healthy, hungry, trained, placeOfWork);
    }


}
