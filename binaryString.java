
import java.util.Scanner;

public class binaryString {
    public static void printStrings(String s, int n ){
        if(s.length()==0 || s.charAt(m-1)=='0'){
            printStrings(s+0, n);
            printStrings(s+1, n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStrings("", n);
    }
}
