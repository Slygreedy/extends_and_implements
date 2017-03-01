package chairwars;

public class Main {
    public static void main(String[] args) {
        //Shape shape = new Shape();
        //shape.playSound();

        //this is static so can go before (when not static it had to go after triangle object created)
        Triangle.Colour colour = new Triangle.Colour();

        Triangle triangle = new Triangle(25,"");
        triangle.playSound();

        Amoeba amoeba = new Amoeba();
        amoeba.playSound();

    }

}
