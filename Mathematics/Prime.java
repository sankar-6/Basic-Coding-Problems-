import java.util.Scanner;
//Prime number Check
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:-");
        int n = sc.nextInt();
        System.out.println(isprime(n)?"prime":"Not a Prime");
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
