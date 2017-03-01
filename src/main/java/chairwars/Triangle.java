package chairwars;

public class Triangle extends Shape {

    public static class Colour {

        public Colour(){
//            int myArea = Area;
            int staticArea = Triangle.staticArea;
        }
    }

    private static int staticArea;

    //before final added, I could have initialised the field in any method but now it must be done in constructor or here
    private int Area;

    //when you call/create object using constructor you can specify name
    public Triangle (int Area, final String name) {
        final String colour;
        colour = "blue";
    //    colour = "red";

        //name = "bob";
        //this.Area = Area;
    }

    @Override
    public void playSound () {
        System.out.println("triangle making noise with an area of " + Area);
        //return Area;
    }

}
