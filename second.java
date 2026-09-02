package Question;

import java.util.Scanner;

public class second {
    public static void main(String[] args){

//--------------Print a number from nto 1----------------//

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = num; i>=0; i--){
            System.out.println("Number is: "+ i);
        }
    }
}
