import java.util.Scanner;
//Reverse a Number
public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse =0;
        while(n!=0){
            int digit=n%10;
            //System.out.println(n%10);
            reverse = reverse*10+digit;
            //System.out.println(n/10);
            n=n/10;
        }
        System.out.println("revesed number is :-"+reverse);
        sc.close();
    }
}
