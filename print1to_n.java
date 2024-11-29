import java.util.Scanner;

public class print1to_n {
    public static int fact(int n){
        if(n==1) return 1;
        fact(n-1);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
