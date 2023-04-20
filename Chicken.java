public class Chicken extends Bird {
    private int height;
    private int weight;
    private String eyeColor;

    public Chicken(int height, int weight, String eyeColor) {
        super(0);
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void fly() {
        System.out.println("Я не умею летать");
    }

    @Override
    public int height() {
        return height();
    }

    @Override
    public int weight() {
        return weight();
    }

    @Override
    public String eyeColor() {
        return eyeColor();
    }

    @Override
    public void makeSound() {
        System.out.println("клак");
        ;
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о куреце:n" +
                "nHeight: " + height +
                "cmnWeight: " + weight +
                "kgnEye color: " + eyeColor);
    }
}
