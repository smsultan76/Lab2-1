// Parent class
class Animal {
    void eat() {
        System.out.println("The animal is eating.");
    }}
// Child class inheriting from the parent class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }}
// Another child class inheriting from the same parent class
class Cat extends Animal {
    void meow() {
        System.out.println("The cat is meowing.");
    }}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method from the Animal class
        myDog.bark(); // Method specific to the Dog class
        Cat myCat = new Cat();
        myCat.eat(); // Inherited method from the Animal class
        myCat.meow(); // Method specific to the Cat class
    }}
