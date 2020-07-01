import java.util.Scanner;

public class First_LastDigit {
    public static void main(String[] args) {


        int num, sum=0, firstdigit, lastdigit;
        Scanner Scanner = new Scanner(System.in);// input a number from user
        System.out.println(" Enter the any Number to sum of first and last digit:");
         num = Scanner.nextInt();
         lastdigit = num % 10; // find last digit to sum
        firstdigit = num; // copy num to first digit


        while (num >= 10) ;
        {
            num = num / 10;
        }
            firstdigit = num;
            sum = firstdigit + lastdigit;
            System.out.println("sum of first and last  =" + sum);

    }

}