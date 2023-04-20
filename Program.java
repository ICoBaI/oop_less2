import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(10);

        String repit = "1.Добавить животное в зоопарк\n" +
                "2.Убирает животное с номером i из зоопарка\n" +
                "3.Посмотреть информацию о животном с номером i\n" +
                "4.Заставить животное с номером i издать звук\n" +
                "5.Напечатать информацию о животных, которые есть на данный момент в зоопарке\n" +
                "6.Заставить всех животных, которые на данный момент есть в зоопарке, издать звук"+
                "7.exit";
        System.out.println(repit);
        while (true) {
            Scanner sc = new Scanner(System.in);
            String read = sc.next();
            if (read.equals("1")) {
                String optional = "Выбирете животное:\n" +
                        "1.Кот\n" +
                        "2.Собака\n" +
                        "3.Курица\n" +
                        "4.Аист\n" +
                        "5.Тигр\n" +
                        "6.Волк\n" +
                        "7.exit";
                System.out.println(optional);
                String input = sc.next();
                if (input.equals("1")) {
                    System.out.println("Введите имя: ");
                    String name = sc.next();
                    System.out.println("Введите вес: ");
                    int weight = sc.nextInt();
                    System.out.println("Ввдедите рост: ");
                    int height = sc.nextInt();
                    System.out.println("Введите цвет глаз: ");
                    String eyeColor = sc.next();
                    System.out.println("Какая порода: ");
                    String bread = sc.next();
                    System.out.println("Имеет прививки");
                    String hasVaccinations = sc.next();
                    System.out.println("Дата рождения: ");
                    String date = sc.next();
                    System.out.println("Есть ли шерсть: ");
                    String presenceOfWool = sc.next();
                    System.out.println("Цвет шерсти или кожи: ");
                    String furColor = sc.next();
                    Cat cat = new Cat(name, weight, height, eyeColor, bread, hasVaccinations, furColor, date,
                            presenceOfWool);
                    zoo.addAnimal(cat);
                    System.out.println(optional);
                }
                if (input.equals("2")) {
                    System.out.println("Введите имя: ");
                    String name = sc.next();
                    System.out.println("Введите вес: ");
                    int weight = sc.nextInt();
                    System.out.println("Ввдедите рост: ");
                    int height = sc.nextInt();
                    System.out.println("Введите цвет глаз: ");
                    String eyeColor = sc.next();
                    System.out.println("Какая порода: ");
                    String bread = sc.next();
                    System.out.println("Имеет прививки");
                    String hasVaccinations = sc.next();
                    System.out.println("Цвет шерсти: ");
                    String furColor = sc.next();
                    System.out.println("Дата рождения: ");
                    String date = sc.next();
                    System.out.println("Дрессированная: ");
                    String training = sc.next();
                    Dog dog = new Dog(name, weight, height, eyeColor, bread, hasVaccinations, furColor, date, training);
                    zoo.addAnimal(dog);
                    System.out.println(optional);
                }
                if (input.equals("3")) {
                    System.out.println("Введите вес: ");
                    int weight = sc.nextInt();
                    System.out.println("Ввдедите рост: ");
                    int height = sc.nextInt();
                    System.out.println("Введите цвет глаз: ");
                    String eyeColor = sc.next();
                    Chicken chicken = new Chicken(height, weight, eyeColor);
                    zoo.addAnimal(chicken);
                    System.out.println(optional);
                }
                if (input.equals("4")) {
                    System.out.println("Введите вес: ");
                    int weight = sc.nextInt();
                    System.out.println("Ввдедите рост: ");
                    int height = sc.nextInt();
                    System.out.println("Введите цвет глаз: ");
                    String eyeColor = sc.next();
                    System.out.println("Высота полета: ");
                    int flightHeight = sc.nextInt();
                    Stork stork = new Stork(height, weight, eyeColor, flightHeight);
                    zoo.addAnimal(stork);
                    System.out.println(optional);
                }
                if (input.equals("5")) {
                    System.out.println("Введите вес: ");
                    int weight = sc.nextInt();
                    System.out.println("Ввдедите рост: ");
                    int height = sc.nextInt();
                    System.out.println("Введите цвет глаз: ");
                    String eyeColor = sc.next();
                    System.out.println("Введите вес: ");
                    String habitat = sc.next();
                    System.out.println("Ввдедите рост: ");
                    String discoveredDate = sc.next();
                    Tiger tiger = new Tiger(weight, height, eyeColor, habitat, discoveredDate);
                    zoo.addAnimal(tiger);
                    System.out.println(optional);
                }
                if (input.equals("6")) {
                    System.out.println("Введите вес: ");
                    int weight = sc.nextInt();
                    System.out.println("Ввдедите рост: ");
                    int height = sc.nextInt();
                    System.out.println("Введите цвет глаз: ");
                    String eyeColor = sc.next();
                    System.out.println("Введите вес: ");
                    String habitat = sc.next();
                    System.out.println("Ввдедите рост: ");
                    String discoveredDate = sc.next();
                    System.out.println("Alpha: ");
                    String alpha = sc.next();
                    Wolf wolf = new Wolf(height, weight, eyeColor, habitat, discoveredDate, alpha);
                    zoo.addAnimal(wolf);
                    System.out.println(optional);
                }

            }
            if (read.equals("2")) {
                System.out.println("Введите i: ");
                int i = sc.nextInt();
                zoo.removeAnimal(i);
                System.out.println(repit);
            }
            if (read.equals("3")) {
                System.out.println("Введите i: ");
                int i = sc.nextInt();
                zoo.getAnimalInfo(i);
                System.out.println(repit);
            }
            if (read.equals("4")) {
                System.out.println("Введите i: ");
                int i = sc.nextInt();
                zoo.makeAnimalSound(i);
                System.out.println(repit);
            }
            if (read.equals("5")) {
                zoo.printCurrentAnimals();
                System.out.println(repit);
            }
            if (read.equals("6")) {
                zoo.makeAllAnimalsSound();
                System.out.println(repit);
            }
            if (read.equals("7")) {
                break;
            }

        }
    }
}
