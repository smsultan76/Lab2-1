import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
public class GetFromFile{
    public static void main(String[] args) {
        try{
            File file = new File("MyFile.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String s = scan.nextLine();
                System.out.println(s);
            }}
        catch(Exception e) {
            System.out.println(e);
        }}}
