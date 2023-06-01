public class ExceptionHandling {
    public static void main(String[] args) {
//        ArithmeticException
        try{
            System.out.println(10/0);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
//        ArrayIndexOutOfBoundsException
        int a[]={6,7,8,9,10,11,12};
        try{
            System.out.println(a[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
//        NullPointerException
        String str=null,name="Sultan";
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println(e);
        }
//        StringIndexOutOfBoundsException
        try{
        System.out.println(name.charAt(10));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println(e);
        }}}
