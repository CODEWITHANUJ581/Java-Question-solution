package Question;

public class Fifth {
    public static void main(String[] args){
        for (int num=1; num<=100; num++){
            if (num%1==0 && num%num==0){
                System.out.println("Number is Prime"+num);
            }
            else
            System.out.println("Numbar is Not prime");
        }
    }
}
