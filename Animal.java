public class Animal {

    public void sleep() {
        System.out.println("buzzo is sleeping");
    }

    public void eat() {
        System.out.println("buzzo is eating");
    }

    public static void main(String[] args) {
        // System.out.println("Animal class");
        Animal buzzo = new Animal();
        buzzo.eat();
        buzzo.sleep();


        Birds tweety = new Birds();
        tweety.fly();
    }

}

class Birds {
    public void fly() {
        System.out.println("Birds can fly");
    }
}
