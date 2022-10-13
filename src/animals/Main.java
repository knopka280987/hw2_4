package animals;

public class Main {
    public static void main(String[] args) {
        Herbivore gazelle = new Herbivore("Газель", 2, "Африка", 90, "трава");
        Herbivore giraffe = new Herbivore("Жираф", 3, "Африка", 60, "листья");
        Herbivore horse = new Herbivore("Лошадь", 5, "Россия", 80, "овес");
        Predator hyena = new Predator("Гиена", 6, "Азия", 50, "падаль");
        Predator tiger = new Predator("Тигр", 2, "Индия", 40, "косули");
        Predator bear = new Predator("Медведь", 7, "Россия", 50, "рыба");
        Amphibian frog = new Amphibian("Лягушка", 1, "болото");
        Amphibian already = new Amphibian("Уж", 2, "лес");
        Flightless peacock = new Flightless("Павлин", 3, "джунгли","ходит");
        Flightless penguin = new Flightless("Пингвин", 4, "Арктика", "переваливается с боку на бок");
        Flightless dodo = new Flightless("Птица додо", 3, "лес", "прыгает");
        Flying gull = new Flying("Чайка", 2, "берег морской", "летает низко");
        Flying falcon = new Flying("Сокол", 5, "степь", "парит в небе");
        Flying albatross = new Flying("Альбатрос", 6, "Южный океан", "летает");
        gazelle.graze();
        System.out.println(giraffe);
        horse.eat();
        hyena.hunt();
        tiger.go();
        System.out.println(bear);
        frog.hunt();
        System.out.println(already);
        System.out.println(peacock);
        penguin.eat();
        dodo.hunt();
        gull.go();
        albatross.fly();
        System.out.println(falcon);


    }
}
