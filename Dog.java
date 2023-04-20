public class Dog implements Pet{

    private String name;
    private int weight;
    private int height;
    private String eyeColor;
    private String breed;
    private String hasVaccinations;
    private String furColor;
    private String birthDate;
    private String training;

    public Dog(String name, int weight, int height, String eyeColor, String breed, String hasVaccinations, String furColor, String birthDate, String training){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
        this.breed = breed;
        this.hasVaccinations = hasVaccinations;
        this.furColor = furColor;
        this.birthDate = birthDate;
        this.training = training;
    }

    
    


    public void training() {
        if (training.equals("да")){
            System.out.println("Уже тренеровали");
        }else{
            System.out.println("Тренеруем");
            training = "да";
        }
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
        System.out.println("Гав");;
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о собаке:n" +
        "Имя: " + name +
        "Порода: " + breed +
        "Рост: " + height +
        "Вес: " + weight +
        "Цыет глаз: " + eyeColor +
        "Цвет шерсти: " + furColor +
        "Дата рождения: " + birthDate +
        "Прививки: " + hasVaccinations + 
        "Наличие обучения: " + training);
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
        System.out.println(name + " shows affection");
    }
}