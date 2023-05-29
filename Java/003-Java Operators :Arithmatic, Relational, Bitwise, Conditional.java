public class Operator {
    public static void main(String[] args) {
        int a=9, b=3;
        System.out.println("[Initialized a=9 and b=3]\n");
        //Increment, Decrement
        System.out.println("Post increment a= "+a++);  //print 9 then a=10
        System.out.println("Pre increment a= "+ ++a);  //a=10+1 then print 11
        System.out.println("Post Decrement a= "+ a--); //print 11 then a=10 
        System.out.println("Pre Decrement a= "+ --a);  //a=10-1 then print 9
        //Arithmatic Operator
        System.out.println("Addition :a+b ="+(a+b));   //print 12
        System.out.println("Substraction :a-b ="+(a-b));// print 6
        System.out.println("Multiplication :a*b ="+(a*b));//print 27
        System.out.println("Division :a/b ="+(a/b));     //print 3
        //Relational Operator.
        System.out.println("a>b : "+(a>b));             //true
        System.out.println("a>=b : "+(a>=b));           //true
        System.out.println("a<b : "+(a<b));             //false
        System.out.println("a<=b : "+(a<=b));           //false
        System.out.println("a==b : "+(a==b));           //false
        System.out.println("a!=b : "+(a!=b));           //true
        //Bitwise Operator:
        System.out.println("a|b\t:"+(a|b));     //Bitwise OR
        System.out.println("a&b\t:"+(a&b));     //Bitwise AND
        System.out.println("a^b\t:"+(a^b));     //Bitwise XOR
        System.out.println("a>>1\t:"+(a>>1));     //Right Shift
        System.out.println("a<<1\t:"+(a<<1));     //Left Shift
        System.out.println("~a\t:"+(~a));     //Complement
        //Conditional Operatior:
        System.out.println("Big Number of a,b: "+(a>b?a:b)); //Big No=9
    }}
