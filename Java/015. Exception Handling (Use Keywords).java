class Throw{
    void validage(int age){                                 //throw keyword
        if(age<=18){
            throw new ArithmeticException("Invalid age");
        }}
    void divide()throws ArithmeticException{                //throws keyword
        System.out.println(10/0);
    }}
public class ExceptionHandling {
    public static void main(String[] args) {
        int a[]={3,6,7};
//        Exception try,catch,finally
        try{
            System.out.println(a[5]);
        }catch(ArrayIndexOutOfBoundsException e ){
            System.out.println(e);
        }finally{
            System.out.println("Finally Block Exicuted.");
        }
        Throw obj = new Throw();
//        Handaling throw, throws
        try{
        obj.validage(12);
        }catch(Exception e){
            System.out.println(e);
        }
        try{
        obj.divide();
        }catch(Exception e){
            System.out.println(e);
        }}}
