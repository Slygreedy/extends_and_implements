package chapter7;

public class Whale extends Mammal {

    private Tail tail;

    public Whale() {
        tail = new Tail();
    }

    //override annotation is not required for code to run it just points out inconsistencies
    @Override
    public String wag() {
        System.out.println("Whale wagging");
        //it is possible to return null but you must return something?
        return "Whale wagging";
    }

}
