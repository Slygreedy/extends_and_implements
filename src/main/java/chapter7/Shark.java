package chapter7;

public class Shark extends Animal {

    private Tail tail;

    public Shark () {
        tail=new Tail();
    }

    public Tail getTail() {
        return tail;
    }

}
