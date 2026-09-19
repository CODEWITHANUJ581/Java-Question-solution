package Question;

import java.util.Scanner;

public class Q18 {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num: ");
        int num=sc.nextInt();
        boolean prime=true;
        for (int n=2; n<=num; n++){
//            boolean prime=true;
            for (int j=2; j<n; j++){
                if (n%j==0){
                    prime=false;
                }
            }
            if (prime){
                System.out.println(n);
                }
            }

        }
    }

