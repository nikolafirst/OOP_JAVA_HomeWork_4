public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("Orange box weight: " + orangeBox.getWeight());

        Box<Apple> newAppleBox = new Box<>();
        appleBox.move(newAppleBox);

        System.out.println("Apple box weight: " + appleBox.getWeight());
        System.out.println("New Apple box weight: " + newAppleBox.getWeight());

        for (Apple apple : newAppleBox) {
            System.out.println("Apple");
        }
    }
}

class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}

class Apple extends Fruit {
    public Apple() {
        super(0.1);
    }
}

class Orange extends Fruit {
    public Orange() {
        super(0.2);
    }
}
