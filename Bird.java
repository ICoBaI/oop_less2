public abstract class Bird implements Animal {
    protected int flightHeight;
 
    protected Bird(int flightHeight) {
        this.flightHeight = flightHeight;
    }

    public void fly() {
        System.out.println("Я лечу на " + flightHeight + " метрах");
    }
}
