public class Stork extends Bird {
    private int height;
    private int weight;
    private String eyeColor;

    public Stork(int height, int weight, String eyeColor, int flightHeight) {
        super(flightHeight);
        this.eyeColor = eyeColor;
        this.height = height;
        this.weight = weight;
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
        System.out.println("кр пиу ер");
        ;
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о аисте:n" +
                "nHeight: " + height +
                "cmnWeight: " + weight +
                "kgnEye color: " + eyeColor);
    }
}
