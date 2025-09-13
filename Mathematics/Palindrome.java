import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:-");
        int n=sc.nextInt();
        palindrome(n);
        sc.close();
    }
    public static void palindrome(int n){
        int t=n;
        int rev=0;
        while(n!=0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(t==rev){
            System.out.println("Is a Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
