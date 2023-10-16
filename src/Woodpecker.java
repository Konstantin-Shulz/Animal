public class Woodpecker extends Bird{

    double beak_size;

    public Woodpecker(boolean wings, int paws, int wingspan, String color, double beak_size) {
        super(wings, paws, wingspan, color);
        this.beak_size = beak_size;
    }

    @Override
    public String toString() {
        return "Woodpecker{" +
                "beak_size=" + beak_size +
                ", wingspan=" + wingspan +
                ", color='" + color + '\'' +
                ", paws=" + paws +
                '}';
    }
}
