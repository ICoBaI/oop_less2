import java.util.LinkedList;
import java.util.Queue;

public class Zoo {

    private Animal[] animals;
    private int maxAnimals;
    private int currentAnimals;
    private Queue<Animal> queue;

    public Zoo(int maxAnimals) {
        this.maxAnimals = maxAnimals;
        currentAnimals = 0;
        animals = new Animal[maxAnimals];
        queue = new LinkedList<>();

    }

    public void addAnimal(Animal animal) {
        if (currentAnimals < maxAnimals) {
            animals[currentAnimals++] = animal;
            queue.add(animal);
            System.out.println("Животное успешно добавлено в зоопарк.");
        } else {
            System.out.println("Зоопарк уже заполнен.");
        }

    }

    public void removeAnimal(int i) {
        if (i >= 1 && i <= currentAnimals) {
            queue.remove(animals[i - 1]);
            for (int j = i - 1; j < currentAnimals - 1; j++) {
                animals[j] = animals[j + 1];
            }
            animals[--currentAnimals] = null;
            System.out.println("Животное успешно убрано из зоопарка.");
        } else {
            System.out.println("Животное с таким номером не найдено.");
        }
    }

    public void getAnimalInfo(int i) {
        if (i >= 1 && i <= currentAnimals) {
            System.out.println(animals[i - 1].toString());
        } else {
            System.out.println("Животное с таким номером не найдено.");
        }
    }

    public void makeAnimalSound(int i) {
        if (i >= 1 && i <= currentAnimals) {
            animals[i - 1].makeSound();
        } else {
            System.out.println("Животное с таким номером не найдено.");
        }
    }

    public void printCurrentAnimals() {
        if (currentAnimals > 0) {
            System.out.println("В зоопарке на данный момент находятся:");
            for (Animal animal : animals) {
                if (animal != null) {
                    System.out.println();
                }
            }
        } else {
            System.out.println("В зоопарке на данный момент нет животных.");
        }
    }

    public void makeAllAnimalsSound() {
        if (currentAnimals > 0) {
            System.out.println("Звуки животных в зоопарке:");
            for (Animal animal : queue) {
                animal.makeSound();
            }
        } else {
            System.out.println("В зоопарке на данный момент нет животных.");
        }
    }
}
