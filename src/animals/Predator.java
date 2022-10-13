package animals;

public class Predator extends Mammal {
    public Predator(String name, Integer age, String habitat, Integer speed, String typeOfFood) {
        super(name, age, habitat, speed, typeOfFood);
    }

    @Override
    public void go() {
        System.out.println(getName() + " бегает и прыгает за добычей");
    }
    @Override
    public void eat() {
        System.out.println(getName() + " ест пойманную добычу");
    }

    public void hunt() {
        System.out.println(getName() + " охотится на других животных");
    }
    @Override
    public String toString() {
        return "Животное: " + getName() + ", возраст: " + getAge() + ", среда обитания: " + getHabitat() + ", скорость: "
                + getSpeed() + " км/час, тип пищи: " + getTypeOfFood();
    }
}


