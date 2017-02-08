package chapter7;

public class Human extends Mammal implements LifeForm {

    public void isBorn () {
        System.out.println("A human is born");
    }

    public void dies () {
        System.out.println("A human dies");
    }
}
