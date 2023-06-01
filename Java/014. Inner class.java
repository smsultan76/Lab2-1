class OuterClass{
    void OutMathode(){
        System.out.println("Outer class:");
    }
    class InnerClass{
        void InMathode(){
            System.out.println("Inner class:");
        }}}
public class InnerClass {
    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.OutMathode();
        OuterClass.InnerClass In = out.new InnerClass();
        In.InMathode();
    }}
