package abstractClassAndInterface.ducks;

public abstract class RubberDuck implements CanSwim {
    public void rubber() {
        System.out.println("I'm rubber");
    }

    @Override
    public void canSwim() {
        System.out.println("Rubber duck can swim");
    }
}
