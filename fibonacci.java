import java.util.Scanner;
public class fibonacci {
    public static int fibb(int n){
        if(n<=1) return n;
        int ans= fibb(n-1) + fibb(n-2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Nth element of fibonacci : ");
        int n = sc.nextInt();

        fibb(n);
        System.out.println("Fibonacci is: " +fibb(n));
    }
}
