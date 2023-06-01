class Person{
    private String name;
    private int age;
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    int getAge(){
        return age;
    }
    void setAge(int age) {
        this.age = age;
    }}
public class Encapsulation {
    public static void main(String[] args) {
        Person ps = new Person();
        ps.setName("Sultan");
        ps.setAge(22);
        System.out.println("Name: "+ ps.getName());
        System.out.println("Age: "+ ps.getAge());
    }}
