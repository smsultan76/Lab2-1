// Parent class
class Animals{
    void dog(){
        System.out.println("Ghew Ghew.");
    }}
// Child class inheriting from the parent class
    class cat extends Animals{
        void cats(){
            System.out.println("Meaw Meaw.");
        }}
public class Inheritance {
    public static void main(String[] args) {
       cat obj=new cat();
       obj.dog();       // Inherited method from the Animals class
       obj.cats();      // Method specific to the cat class
    }}
