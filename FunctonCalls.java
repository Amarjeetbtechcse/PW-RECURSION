public class FunctonCalls{
    public static void mango(){
        System.out.println("hi i am in mango zone");
    }
    public static void banana(){
        mango();
        System.out.println("hi, i am in banana zone");
    }
    public static void apple(){
        banana();
        System.out.println("hi, i am in apple zone");
        mango();
    }
    public static void main(String[] args){
        System.out.println("hi, i am in main");
        apple();
    }
}
