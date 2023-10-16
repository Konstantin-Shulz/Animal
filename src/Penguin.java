public class Penguin extends Bird{

    String view;

    public Penguin(boolean wings, int paws, int wingspan, String color, String view) {
        super(wings, paws, wingspan, color);
        this.view = view;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "view='" + view + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
