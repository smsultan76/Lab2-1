// Grandparent class
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }}
// Parent class inheriting from the grandparent class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }}
// Child class inheriting from the parent class
class Bulldog extends Dog {
    void guard() {
        System.out.println("The bulldog is guarding.");
    }}
public class MultilevelInheritance{
    public static void main(String[] args) {
        Bulldog myBulldog = new Bulldog();
        myBulldog.eat();  // Inherited method from the Animal class
        myBulldog.bark();  // Inherited method from the Dog class
        myBulldog.guard();  // Method specific to the Bulldog class
    }}
