import java.util.Scanner;

public class aPower_b {
    public static int pow(int a, int b){
        if(a==0 && b==0){
            System.out.println("Not Defined");
            return -1;
        }
        if(b==0) return 1;
        return a * pow(a, b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a= sc.nextInt();
        System.out.print("Enter B: ");
        int b= sc.nextInt();

        System.out.println(a+" raised to the power "+b+" is: "+pow(a,b));
    }
}
