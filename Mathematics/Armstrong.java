import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        armstrong(n);
        sc.close();
    }
    public static void armstrong(int n){
        int temp=n;
        int sum=0;
        int digits=String.valueOf(temp).length();
        while(temp>0){
            sum+=Math.pow(temp%10,digits);
            temp /=10;
        }
        if(sum==n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not an Armstrong");
        }
    }
    public static int count(int n){
            if(n==0){
                return 1;
            }
            int count=0;
            while(n>0){
                n=n/10;
                count++;
            }
            return count;
    }
            
}

