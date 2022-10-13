package animals;

public class Flightless extends Bird {
    public Flightless(String name, Integer age, String habitat, String movementType) {
        super(name, age, habitat, movementType);
    }
    @Override
    public void go() {
        System.out.println(getName() + " ходит по земле и плавает");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест пойманное в воде и на земле, или чем покормит человек");
    }

    public void walk() {
        System.out.println(getName() + " гуляет с сородичами");
    }

    @Override
    public String toString() {
        return "Животное: " + getName() + ", возраст: " + getName() + ", среда обитания: " + getHabitat()
                + ", тип перемещения: " + getMovementType();
    }

}

