import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n, i;
//One dimensional Array.
        System.out.println("Enter size of one dimensional array.");
        n= sc.nextInt();
        int[] arr=new int[n];
        for(i=0;i<n;i++)    arr[i]=sc.nextInt();        				//input data on array
        for(i=0;i<n;i++)    System.out.print(arr[i]+"\t");			//Print array value
//Size of array printing.
        System.out.println("\nlength of array: "+arr.length);
//Two dimensional Array
        int row, col,j;
        System.out.println("Enter row and column two dimensional array.");
        row = sc.nextInt();
        col = sc.nextInt();
        int[][] mat=new int[row][col];
        System.out.println("Enter data:");
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                mat[i][j] = sc.nextInt();  					 //Two dimensional array input  
            }}
        for(i=0;i<row;i++){
            for(j=0;j<col;j++){
                System.out.print(mat[i][j]+"\t");  				//Two dimensional array print
            }
            System.out.println();
        }}}
