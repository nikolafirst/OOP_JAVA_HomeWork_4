import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Box<T extends Fruit> implements Iterable<T> {

    private List<T> fruits;

    public Box() {
        fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public double getWeight() {
        double totalWeight = 0;
        for (T fruit : fruits) {
            totalWeight += fruit.getWeight();
        }
        return totalWeight;
    }

    public void move(Box<T> box) {
        for(T fruit : fruits) {
            box.add(fruit);
        }
        fruits.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return fruits.iterator();
    }
}
