package animals;

public class Bird extends Animal {
    private final String movementType;

    public Bird(String name, Integer age, String habitat, String movementType) {
        super(name, age, habitat);
        if (movementType == null || movementType.isBlank()) {
            this.movementType = "Нет данных";
        } else {
            this.movementType = movementType;
        }
    }

    public String getMovementType() {
        return movementType;
    }


    @Override
    public void eat() {
        System.out.println(getName() + " ест тех, кого поймает");
    }

    @Override
    public void go() {
        System.out.println(getName() + " передвигается по земле и воздуху");
    }

    public void hunt() {
        System.out.println(getName() + " охотится на кого-то");
    }
    @Override
    public String toString() {
        return "Животное: " + getName() + ", возраст: " + getAge() + ", среда обитания: " + getHabitat()
                + ", тип передвижения:" + movementType;
    }
}

