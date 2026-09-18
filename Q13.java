package Question;

public class Q13 {
    static void main() {

        //Reverse the value

        int n=1;
        int revval=0;
        while (n!=0){
            int digit=n%10;
            revval=revval*10+digit;
            n=n/10;
        }
        if (n==revval){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
//        System.out.println("Reverse val is: "+revval);
    }
}
