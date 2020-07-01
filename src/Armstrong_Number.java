import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[]args){
       int num, original,result, n1,n2,n3;
        Scanner sc=new Scanner(System.in);
     System.out.println("Please enter a number 3 digit to check if it is an Armstrong or not");
     num=sc.nextInt();
     original=num;

     n1=num%10;
     num=num/10;

     n2=num%10;
     num=num/10;

     n3=num%10;

     result=n1*n1*n1 + n2*n2*n2 + n3*n3*n3;

     if (result==original){
         System.out.println("Number is an Armstrong number");
     }
     else
        System.out.println ("Number is not an Armstrong number");

    }
}

