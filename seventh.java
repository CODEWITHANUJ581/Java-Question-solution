package Question;

import java.util.Scanner;

public class seventh {
    public static void main(String[] args) {

//-------------Print sum of 1 to n number-------------//

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int sum=0;
        for (int num=1; num<=n; num++){
            sum=sum+num;
        }
        System.out.print("Add is: "+sum);
    }
}
