public class Wolf implements WildAnimal {

    private int height;
    private int weight;
    private String eyeColor;
    private String habitat;
    private String discoveredDate;
    private String leaderPack;

    public Wolf(int height, int weight, String eyeColor, String habitat, String discoveredDate, String leaderPack) {

        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.habitat = habitat;
        this.discoveredDate = discoveredDate;
        this.leaderPack = leaderPack;

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
        System.out.println("ayyy");
    }

    @Override
    public void getInfo() {
        System.out.println("Информация о волке:n" +
                "Рост: " + height +
                "Вес: " + weight +
                "Цыет глаз: " + eyeColor +
                "Естественная среда: " + habitat +
                "Дата обнаружения: " + discoveredDate +
                "Alpha" + leaderPack);
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
