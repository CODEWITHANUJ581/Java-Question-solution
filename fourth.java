package Question;

import java.util.Scanner;

public class fourth {
    public  static  void main(String[] args) {

//-----------Print hundred times your name---------//

        String name1 = "Anuj";
        for (int i=1; i<=100; i++){
            System.out.println("Your name is: "+name1);
        }

//----------Same Question but take input then print------------//

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name2 = sc.nextLine();
        for (int i = 1; i<=100; i++){
            System.out.println("Your name is: "+name2);
        }
    }
}
