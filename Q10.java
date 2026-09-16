package Question;

public class Q10 {
    static void main() {

        //Print digit of a number

        int n= 5134;
        while (n!=0){
            int digit=n%10;
            System.out.println(digit);
            n=n/10;
        }
    }
}
