package chapter7;

public class Main {

    public static void main(String[] args) {

        Whale whale = new Whale();
        whale.wag();

        Shark shark = new Shark();
        shark.getTail().wag();

        Human human = new Human();
        human.isBorn();
        human.dies();
        human.isWarmBlooded();

    }
}
