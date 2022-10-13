package animals;

public abstract class Animal {
    private final String name;
    private final Integer age;
    private String habitat;

    public Animal(String name, Integer age, String habitat) {
        this.name = name;
        this.age = age <= 0 ? 1 : age;
        setHabitat(habitat);
    }

    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }
    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.isBlank()) {
            this.habitat = "Нет данных";
        } else {
            this.habitat = habitat;
        }
    }
    public  void sleep() {
        System.out.println(getName() + "Спит");
    }

    public abstract void eat();

    public abstract void go();

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

