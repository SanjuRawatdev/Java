import java.util.*;
class Twonumberswap {
    public static void main(String arr[]){
        int a,b;
    
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a two number swapping : ");
        a = ob.nextInt();
        b = ob.nextInt();

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
