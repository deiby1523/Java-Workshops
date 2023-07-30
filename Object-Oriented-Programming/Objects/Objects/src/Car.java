public class Car {
    private byte nWheels;
    private int engine;
    private int length;
    private int width;
    private int weight;

    public Car() {
        this.nWheels = 4;
        this.engine = 1600;
        this.length = 2000;
        this.width = 300;
        this.weight = 800;
    }

    public byte getNWheels() {
        return this.nWheels;
    }

}
