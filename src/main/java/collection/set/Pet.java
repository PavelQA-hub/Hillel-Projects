package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Pet {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }
    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>();
        for (int i = 0; i < 4; i++) {
            cats.add(new Cat("cat1" + i));
        }
        return cats;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog("dog1" + i));
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet <Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        Iterator itr = pets.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
