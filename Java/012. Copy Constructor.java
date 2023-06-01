class Person{
    private String name;
    private int age;
    Person(String name, int age){
        this.name =name;
        this.age = age;
    }
    //Copy Constructor
    Person(Person next){
        this.name= next.name;
        this.age = next.age;
    }
    void display(){
        System.out.println("Name= "+name+"\nage= "+age);
    }}
public class CopyConstructor {
    public static void main(String[] args) {
        Person p1= new Person("Sultan",22);
        Person p2= new Person(p1);
        p1.display();
        p2.display();
    }}
