package Question;

import java.util.Scanner;

public class Q17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int perfectnum = 0;
        for (int i = 1; i*i<num-1; i++) {
            if (num % i == 0) {
                perfectnum = i + perfectnum;
            }
        }
        if (perfectnum == num) {
            System.out.println("Perfect");
        }
        else {
            System.out.println("not perfect");
        }
    }
//        int perfectnum=1;
//        for (int i=2; i*i<=num; i++){
//            if (num%i==0){
//                int ffac=i;
//                int secfeac=num/i;
//                perfectnum=perfectnum+ffac+secfeac;
//            }
//        }
//        if (num==perfectnum){
//            System.out.println("Perfect");
//        }
//        else {
//            System.out.println("not Perfect");
//        }
    }

