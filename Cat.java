public class Cat implements Pet{

    private String name;
    private int weight;
    private int height;
    private String eyeColor;
    private String breed;
    private String hasVaccinations;
    private String furColor;
    private String birthDate;
    private String presenceOfWool;

    public Cat(String name, int weight, int height, String eyeColor, String breed, String hasVaccinations, String furColor, String birthDate, String presenceOfWool){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.hasVaccinations = hasVaccinations;
        this.furColor = furColor;
        this.birthDate = birthDate;
        this.presenceOfWool = presenceOfWool;
    }

    @Override
    public int height() {
        return height;
    }

    @Override
    public int weight() {
        return weight;
    }

    @Override
    public String eyeColor() {
        return eyeColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу");;
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о коте:n" +
        "Имя: " + name +
        "Порода: " + breed +
        "Рост: " + height +
        "Вес: " + weight +
        "Цыет глаз: " + eyeColor +
        "Цвет шерсти: " + furColor +
        "Дата рождения: " + birthDate +
        "Прививки: " + hasVaccinations +
        "Шерсть: " + presenceOfWool);
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String breed() {
        return breed;
    }

    @Override
    public String hasVaccinations() {
        return hasVaccinations;
    }

    @Override
    public String furColor() {
        return furColor;
    }

    @Override
    public String birthDate() {
        return birthDate;
    }

    @Override
    public void showAffection() {
        System.out.println(name + " проявляет ласку мурлыканьем");
    }
}
