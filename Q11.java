package Question;

public class Q11 {
   public static void main(String[] args){

       //Print the count of all number

        int n=342134;
        int count=0;
        while (n!=0){
            int digit= n%10;
            count++;
            n=n/10;
        }
       System.out.println("Total number is: "+count);
    }
}
