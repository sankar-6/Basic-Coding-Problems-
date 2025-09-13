import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println("Fibonacci series");
        for(int i=0;i<n;i++){
        System.out.print(fibonacci(i)+" ");
        }
        sc.close();
    }
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
    /*static void Fibonacci(int N)
    {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(n1 + " ");

            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        } */

}
