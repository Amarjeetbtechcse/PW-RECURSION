import java.util.Scanner;

public class maze{
    public static int maze(int m, int n ){
        //base case
        if(m==1 || n==1) return 1;
        //work 
        int rightWays  = maze(m,n-1);
        int downWays = maze(m-1,n);
        return rightWays + downWays;

        //return function
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m: ");
        int n = sc.nextInt();
        System.out.println("Enter n: ");
        int m = sc.nextInt();

        System.out.println(maze(m,n));
    }
}