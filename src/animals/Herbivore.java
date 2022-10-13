package animals;

public class Herbivore extends Mammal {
    public Herbivore(String name, Integer age, String habitat, Integer speed, String typeOfFood) {
        super(name, age, habitat, speed, typeOfFood);
    }

    @Override
    public void go() {
        System.out.println(getName() + " ходит по полям и лугам");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест травушку-муравушку");
    }

    public void graze() {
        System.out.println(getName() + " пасется на лугу");
    }
    @Override
    public String toString() {
        return "Животное: " + getName() + ", возраст: " + getAge() + ", среда обитания: " + getHabitat() + ", скорость: "
                + getSpeed() + " км/час, тип пищи: " + getTypeOfFood();
    }
}

