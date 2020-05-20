package builder;

import entity.Dog;

import java.util.List;

public class DogBuilder implements Builder<Dog> {

    @Override
    public Dog build(List<String> parameters) {
        String name = parameters.get(0);
        int age = Integer.parseInt(parameters.get(1));
        boolean dirty = Boolean.parseBoolean(parameters.get(2));
        boolean healthy = Boolean.parseBoolean(parameters.get(3));
        boolean hungry = Boolean.parseBoolean(parameters.get(4));
        boolean trained = Boolean.parseBoolean(parameters.get(5));
        String placeOfWork = parameters.get(6);
        return new Dog(name, age, dirty, healthy, hungry, trained, placeOfWork);
    }
}
