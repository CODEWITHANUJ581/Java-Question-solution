package Question;

import java.util.Scanner;

public class Q14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter palindrome num: ");
        int num=sc.nextInt();
        int orinum=num;
        int revnum=0;
        while (num!=0){
            int digit=num%10;
            revnum=revnum*10+digit;
            num=num/10;
        }
        if (orinum==revnum){
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not palindrome");
    }
}
