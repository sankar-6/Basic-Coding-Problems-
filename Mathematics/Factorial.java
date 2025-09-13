import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n+" factorial is "+factorial(n));
        sc.close();
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    
}

