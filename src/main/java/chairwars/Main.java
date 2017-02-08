package chairwars;

public class Main {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        //shape.playSound();

        Triangle triangle = new Triangle(25);
        triangle.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.playSound();

    }

}
