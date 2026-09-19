package Question;

import java.util.Scanner;

public class Q15 {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value: ");
        int num= sc.nextInt();
        boolean numv=true;
        for (int i=2; i*i<=num; i++){
            if (num%i==0){
                numv=false;
            }
        }
        if (numv){
            System.out.println("not prime");
        }
        else {
            System.out.println("prime");
        }
//        for (int i=2; i<=num-1; i++) {
//            if (num%i == 0) {
//                numv=false;
//            }
//        }
//        if (numv){
//            System.out.println("not prime");
//        }
//        else {
//            System.out.println("prime");
//        }
    }
}
