package animals;

public class Amphibian extends Animal {

    public Amphibian(String name, Integer age, String habitat) {
        super(name, age, habitat);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест в основном безпозвоночных");
    }

    @Override
    public void go() {
        System.out.println(getName() + " передвигается по суше и воде");
    }

    public void hunt() {
        System.out.println(getName() + " охотится в воде и на суше");
    }

    @Override
    public String toString() {
        return "Животное: " + getName() + ", возраст: " + getAge() + ", среда обитания: " + getHabitat();
    }
}

