
import java.util.Scanner;

public class parameterized_Sum{
    public static void findSum(int n, int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        findSum(n-1, s+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        findSum(n,0);
    }
}