// Abstract class
abstract class Animal {
    // Abstract method
    public abstract void makeSound();
    // Non-abstract method
    public void sleep() {
        System.out.println("Zzzz...");
    }}
// Concrete class extending the abstract class
class Dog extends Animal {
    // Implementing the abstract method
    public void makeSound() {
        System.out.println("Ghee Ghew!");
    }}
// Interface
interface Vehicle {
    void start();
    void stop();
}
class Car implements Vehicle {
    // Implementing the interface methods
    public void start() {
        System.out.println("Car started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }}
public class AbstractclassandInterface {
    public static void main(String[] args) {
        // Create an instance of the concrete class
        Dog dog = new Dog();
        // Call the abstract method
        dog.makeSound();
        // Call the non-abstract method
        dog.sleep();
        // Create an instance of the class implementing the interface
        Car car = new Car();
        // Call the interface methods
        car.start();
        car.stop();
    }}
