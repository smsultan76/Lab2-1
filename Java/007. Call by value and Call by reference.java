class Change{
    int x =13, y = 19;
    void callByValue(int x, int y){
        int temp = x;
        x = y;
        y = temp;
    }
    void callByReference(Change obj){
        int temp = obj.x;
        obj.x = y;
        obj.y = temp;
    }}
public class CallbyValueandReference {
     public static void main(String[] args) {
        Change obj = new Change();
        System.out.println("Call by value :\nBefore swaping\nx = "+obj.x+"\ny = "+obj.y);
        obj.callByValue(obj.x, obj.y);
        System.out.println("After swaping\nx = "+obj.x+"\ny = "+obj.y);
        System.out.println("Call by reference :\nBefore swaping\nx = "+obj.x+"\ny = "+obj.y);
        obj.callByReference(obj);
        System.out.println("After swaping\nx = "+obj.x+"\ny = "+obj.y);
    }}
