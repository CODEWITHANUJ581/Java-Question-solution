package Question;

public class Q12 {
    static void main() {
        int n=123345;
        int sum=0;
        while (n!=0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        System.out.println("Sum is: "+sum);
    }
}
