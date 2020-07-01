import java.util.Scanner;

public class CountPositive_Negative_zero {
    public static void main(String[]args){

        Scanner console = new Scanner (System.in);

        int number,
                countPositive=0,
                countNegative=0,
                countZero=0;
                char choice;
                do {
                    System.out.println("Enter the number");
                     number = console.nextInt();
                     if(number>0)
                     {
                         countPositive++;
                     }
                     else if( number<0)
                     {
                         countNegative++;
                     }
                     else
                     {
                         countZero++;
                     }
                     System.out.println("Do you want continue y/n");
                     choice = console.next().charAt(0);
                }

                while (choice=='y'|| choice=='y');
               System.out.println("Positive number:" + countPositive);
               System.out.println("Negative number:" +  countNegative);
               System.out.println("Zero number" + countZero);

    }
}
