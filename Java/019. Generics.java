//          Generic class
class Box<T> {
    private T item;
    public Box(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }}
public class Generics {
    public static void main(String[] args) {
//         Create a generic class instance with Integer type
        Box<Integer> integerBox = new Box<>(10);
//         Create a generic class instance with String type
        Box<String> stringBox = new Box<>("Hello, Generics!");
//         Get and print the contents of the integer box
        int intValue = integerBox.get();
        System.out.println("Integer Value: " + intValue);
//         Get and print the contents of the string box
        String stringValue = stringBox.get();
        System.out.println("String Value: " + stringValue);
    }}
