package Question;

import java.util.Scanner;

public class Third {
    public static void main(String[] args){

//-----------Print 10 multiple of N number------------//

        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
