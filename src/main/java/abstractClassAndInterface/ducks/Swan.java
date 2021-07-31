package abstractClassAndInterface.ducks;

public  class Swan extends Birds implements CanSwim, CanFly{


    @Override
    public void canFly() {

    }

    @Override
    public void canSwim() {

    }

    @Override
    public int hashcode() {return super.hashCode(); }

    @Override
    public boolean equals(Object obj) {return super.equals(obj); }

    @Override
    public String toString() {return super.toString(); }

    public void EatGrass() {
        System.out.println("Swan can eat grass");
    }
}
