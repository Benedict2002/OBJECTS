package Animal;
public class Dog extends Animal{
    private  int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    private void  chew(){
        System.out.println("Chew method called ");
    }
    @Override
    public void eat() {
        System.out.println("dog.eat called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog walking called");
        move(5);
    }
    public void run(){
        System.out.println("Dog running called");
        move(10);
    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, size, 1, weight);
        this.eyes= eyes;
        this.legs= legs;
        this.tail= tail;
        this.teeth= teeth;
        this.coat= coat;
    }
}