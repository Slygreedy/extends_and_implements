package chairwars;

public class Triangle extends Shape {

    int Area;

    public Triangle (int Area) {
        this.Area = Area;
    }

    public void playSound () {
        System.out.println("triangle making noise with an area of " + Area);
        //return Area;
    }

}
