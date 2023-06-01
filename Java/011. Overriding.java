class Animal{
    void MakeSound(){
        System.out.println("Propertise of Animal class");
    }}
    class Dog extends Animal{
//        Override
        void MakeSound(){
            System.out.println("Ghew Ghew");
        }}
    class Cat extends Animal{
//        Override
        void MakeSound(){
            System.out.println("Meao Meao");
        }}
public class Overriding {
    public static void main(String[] args) {
        Animal an= new Animal();
        an.MakeSound();
        Dog dog=new Dog();
        dog.MakeSound();
        Cat cat = new Cat();
        cat.MakeSound();
    }}
