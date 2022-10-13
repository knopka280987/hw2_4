package animals;

public class Mammal extends Animal {
    private Integer speed;
    private String typeOfFood;


    public Mammal(String name, Integer age, String habitat, Integer speed, String typeOfFood) {
        super(name, age, habitat); setHabitat(habitat);
        setSpeed(speed);
        setTypeOfFood(typeOfFood);
    }


    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed <= 0 ? 5 : speed;
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if (typeOfFood == null || typeOfFood.isBlank()) {
            this.typeOfFood = "Нет данных";
        } else {
            this.typeOfFood = typeOfFood;
        }
    }

    public void walk() {
        System.out.println(getName() + " гуляет");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест траву или мясо");
    }

    @Override
    public void go() {
        System.out.println(getName() + " передвигается по суше");
    }

    @Override
    public String toString() {
        return "Животное: " + getName() + ", возраст: " + getAge() + ", среда обитания: " + getHabitat() + ", скорость: "
                + speed + " км/час, тип пищи: " + typeOfFood;
    }
}

