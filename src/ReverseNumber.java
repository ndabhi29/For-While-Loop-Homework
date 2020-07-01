import java.util.Scanner;

public class ReverseNumber {
    public static void main (String[]args){
        int num=0, reversed=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
         num = scanner.nextInt();
         while (num !=0){
             int digit =num %10;
             reversed=reversed*10 + digit;
             num/=10;
         }
        System.out.println("Reversed Number;"+ reversed);
    }
}

