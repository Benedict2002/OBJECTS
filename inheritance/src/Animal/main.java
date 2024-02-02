package Animal;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,5,1,5);
        Dog dog = new Dog("Bosko",8,8,2,4,1,32,"broun");
        dog.eat();
        dog.walk();
        System.out.println("*********************************************************");
        dog.run();

    }
}
