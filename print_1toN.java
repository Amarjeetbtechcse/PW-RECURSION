
import java.util.Scanner;

public class print_1toN {
    static int n;//global declare
    public static void print(int x){
        if(x>n) return;//base case
        System.out.println(x);//work
        print(x+1);//again call called recursion
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        n = sc.nextInt();
        print(1);
        }
}
