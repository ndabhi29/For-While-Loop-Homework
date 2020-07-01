import java.util.Scanner;

public class  Print_Table {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Number");
        int num1=in.nextInt();
        for (int i=0; i<10; i++){
            System.out.println(num1 + "*" + (i+1) + "=" +(num1 * (i+1)));
        }
    }
}
