class DataTypes{
     byte b;  char c;  short sh;  int i;  long l;  float f;  double d;  boolean bool;
}
public class DefaultValue {
    public static void main(String[] args) {
        DataTypes dt=new DataTypes();
        System.out.println("Dafault value of byte: "+dt.b);       	  // 0
        System.out.println("Dafault value of char: "+dt.c);    	     //
        System.out.println("Dafault value of Short: "+dt.sh);    	   // 0
        System.out.println("Dafault value of Int: "+dt.i);         	 // 0
        System.out.println("Dafault value of Long: "+dt.l);        	 // 0
        System.out.println("Dafault value of Float: "+dt.f);      	  // 0.0
        System.out.println("Dafault value of Double: "+dt.d);       	// 0.0
        System.out.println("Dafault value of Boolean: "+dt.bool);   // false
    }}
