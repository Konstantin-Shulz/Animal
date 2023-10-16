public class Main {
    public static void main(String[] args) {

        exampleAnimal1();

    }

    private static void exampleAnimal1() {

        Bird bird1 = new Bird(true,2,60,"серый");
        System.out.println(bird1.toString());

        Penguin pen1 = new Penguin(false,2,150,"черно-белый","Императорский");
        System.out.println(pen1.toString());

        Woodpecker woody1 = new Woodpecker(true,2,65,"коричневый", 17);
        System.out.println(woody1.toString());

    }
}