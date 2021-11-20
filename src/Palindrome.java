import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int Sum=0;
        int n= sc.nextInt();
        int Temp= n;
        while (n>0){
            int r=n%10;
            Sum=(Sum*10)+r;
            n=n/10;
        }
        if (Temp==Sum)
            System.out.println(Temp +"  It is a Palidrome");
        else
            System.out.println(Temp+" It is not Palindrome");

    }
}
