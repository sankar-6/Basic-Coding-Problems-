import java.util.Scanner;
//Reverse a Number 
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum =0;
        while(n!=0){
            int digit=n%10;
            //System.out.println(n%10);
            sum = sum+digit;
            //System.out.println(n/10);
            n=n/10;
        }
        System.out.println("sum of number is :"+sum);
        sc.close();
    }
}

