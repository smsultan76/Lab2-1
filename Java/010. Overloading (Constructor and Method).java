class Area{
//Constructor Overloading
    Area(int l, int w){
        System.out.println("Area of Rectangle="+l*w);
    }
    Area(double r){
        System.out.println("Area of Circle="+(3.14159*r*r));
    }
//Mathode Overloading
    int add(int x,int y){
        return x+y;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }}
public class Overloading {
    public static void main(String[] args) {
        //call Constructor
        Area obj = new Area(6,5);
        Area obj1 = new Area(6);
        //clll Mathode
        System.out.println("5+6= "+obj.add(5,6));
        System.out.println("5+6+7= "+obj.add(5,6,7));
    }}
