import java.util.Scanner;
//prime numbers between range
public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range:-");
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            if(isprime(i)){
                System.out.print(i+" ");
            }
        }
       
        sc.close();
    }
    public static boolean isprime(int n){
        n=Math.abs(n);
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
