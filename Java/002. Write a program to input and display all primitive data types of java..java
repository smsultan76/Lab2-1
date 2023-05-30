import java.util.Scanner;
public class DefaultPrimitiveInOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input data in this order:\n byte,\t char,\t short,\t int,\t long,\t float,\t double,\t Boolean.");
         byte b = sc.nextByte();			 //range -128 to 127
         char c = sc.next().charAt(0);		//range 0-65,535
         short sh = sc.nextShort();			//range -32,768 to 32,767
         int i = sc.nextInt();    			//range -2^31 to 2^31-1
         long L = sc.nextLong(); 		            //range -2^63 to 2^63-1
         float f = sc.nextFloat();			// 4 Byte
         double d = sc.nextDouble();    		// 8 Byte
         boolean bool = sc.nextBoolean();		// false(0) or true(1)
         System.out.println("Byte: "+b+"\nChar:"+c+"\nShort: "+sh+"\nInt: "+i+"\nLong: "+L+"\nFloat: "+f+"\nDouble: "+d+"\nBoolean: "+bool);
    }}
