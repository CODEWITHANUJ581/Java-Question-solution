package Question;

import java.util.Scanner;

public class First {
    public static void main(String[] args){

//-----------Print counting from 1 to N------------//

        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int fristnum=sc.nextInt();
        for (int i=0; i<=fristnum; i++){
            System.out.println(i);
        }
    }
}