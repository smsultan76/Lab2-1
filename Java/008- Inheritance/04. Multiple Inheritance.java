// First parent interface
interface Flyable {
    void fly();
}
// Second parent interface
interface Swimmable {
    void swim();
}
// Child class implementing multiple interfaces
class Duck implements Flyable, Swimmable {
    //Override
    public void fly() {
        System.out.println("The duck is flying.");
    }
    //Override
    public void swim() {
        System.out.println("The duck is swimming.");
    }}
public class MultipleInheritance {
    public static void main(String[] args) {
        Duck myDuck = new Duck();
        myDuck.fly(); // Method from the Flyable interface
        myDuck.swim(); // Method from the Swimmable interface
    }}
