package animals;

public class Flying extends Bird{
    public Flying(String name, Integer age, String habitat, String movementType) {
        super(name, age, habitat, movementType);
    }

    @Override
    public void go() {
        System.out.println(getName() + " летает по небу и ходит по земле");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест пойманное в небе и на земле");
    }

    public void fly() {
        System.out.println(getName() + " летает");
    }

    @Override
    public String toString() {
        return "Животное: " + getName() + ", возраст: " + getName() + ", среда обитания: " + getHabitat() +
                ", тип перемещения: " + getMovementType();
    }
}

