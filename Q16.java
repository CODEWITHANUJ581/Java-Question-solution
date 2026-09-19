package Question;

import java.util.Scanner;

public class Q16 {
    static void main() {
        // Find armstrong number

        System.out.println("Check number is Armstrong number or not:");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter NUmber: ");
        int num=sc.nextInt();
        int originalnum=num;
        int armstrongnum=0;
        while (num!=0){
            int digit=num%10;
            armstrongnum=digit*digit*digit+armstrongnum;
            num=num/10;
        }
        if (originalnum==armstrongnum){
            System.out.println("num is armstrong");
        }
        else {
            System.out.println("not armstrong");
        }
    }
}
