public class Flamingo extends Bird{
    int age;

    String name;

    public Flamingo(boolean wings, int paws, int wingspan, String color, int age, String name) {
        super(wings, paws, wingspan, color);
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flamingo{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", wings=" + wings +
                '}';
    }
}

