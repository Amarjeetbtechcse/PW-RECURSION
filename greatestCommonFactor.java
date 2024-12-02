
import java.util.Scanner;
public class greatestCommonFactor {
    public static int hcf(int a, int b){
        if(b%a==0) return a;
        return hcf(b%a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();

        System.out.println("Highest Common Factor is "+hcf(a,b));
    }
}
