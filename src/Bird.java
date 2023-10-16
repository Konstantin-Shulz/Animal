public class Bird extends Animal{
    int wingspan;
    String color;

    public Bird(boolean wings, int paws, int wingspan, String color) {
        super(wings, paws);
        this.wingspan = wingspan;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "wingspan=" + wingspan +
                ", paws=" + paws +
                '}';
    }
}


