package Question;

public class sixth {
    public static void main(String[] args){

//-----------Print Prime number--------------//

//        int n=11;
//        if (n<=1){
//            System.out.println("num is not prime");
//            return;
//    }
//        boolean isprime=true;
//        for (int i=2; i<n; i++){
//            if (n%i==0){
//                isprime=false;
//            }
//        }
//        if (isprime){
//            System.out.print(n+" ");
//        }
//        else
//            System.out.println("Prime num");

//--------------Print num 1 to 100--------------//

        for (int n=2; n<=100; n++){
        boolean isprime=true;
        for (int i=2; i<n; i++){
            if (n%i==0){
                isprime=false;
            }
        }
        if (isprime){
            System.out.print(n+" ");
        }
        else
            System.out.println("Prime num");
        }
    }
}