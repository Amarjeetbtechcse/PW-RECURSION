public class pip {
    public static void pip(int n){//pre in post
        if(n==0) return;
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
        pip(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        pip(3);
    }
}
