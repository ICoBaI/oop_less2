public class Tiger implements WildAnimal {

    private int height;
    private int weight;
    private String eyeColor;
    private String habitat;
    private String discoveredDate;

    public Tiger(int height, int weight, String eyeColor, String habitat, String discoveredDate) {

        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.habitat = habitat;
        this.discoveredDate = discoveredDate;

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
        System.out.println("Роар");
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о тигре:n" +
                "Рост: " + height +
                "Вес: " + weight +
                "Цыет глаз: " + eyeColor +
                "Естественная среда: " + habitat +
                "Дата обнаружения: " + discoveredDate);
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public String getDiscoveredDate() {
        return discoveredDate;
    }

}
