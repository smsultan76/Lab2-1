class Specifire{
    public int pub = 10;
    private int pri = 20;
    protected int pro = 30;
    int getprivate(){
        return pri;
    }
    int getprotected(){
        return pro;
    }}
public class AccessSpecifire {
    public static void main(String[] args) {
        Specifire obj= new Specifire();
        System.out.println(obj.pub);            // Accessible directly
//      System.out.println(obj.pri);              // Not accessible (compile error)
        System.out.println(obj.pro);            // Accessible within subclass
        System.out.println(obj.getprivate());   // Only Accessible private by mathode
        System.out.println(obj.getprotected()); // Also Accessible protected by mathode
    }}
