package abstractClassAndInterface.ducks;

import java.util.Objects;

public abstract class Birds {
    public void bird() {
        System.out.println("I'm bird");
    }

    private boolean beak = true;

    public boolean isBeak() {
        return beak;
    }

    public abstract int hashcode();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return beak == birds.beak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(beak);
    }
}
