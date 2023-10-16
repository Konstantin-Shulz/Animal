public class Hippopotam extends Animal{
    double weight;
    double speed;

    public Hippopotam(boolean wings, int paws, double weight, double speed) {
        super(wings, paws);
        this.weight = weight;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Hippopotam{" +
                "weight=" + weight +
                ", speed=" + speed +
                ", paws=" + paws +
                '}';
    }
}
