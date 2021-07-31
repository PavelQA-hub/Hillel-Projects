package abstractClassAndInterface.ducks;

public class Main {
    public static void main(String[] args) {
        Swan swan = new Swan();
        Platypus platypus = new Platypus();

        swan.bird();
        swan.canFly();
        swan.canSwim();

        platypus.canSwim();
        System.out.println("asd");
    }
}
