import java.util.*;
class Simpleinterest {
    public static void main(String arr[]){
    int si,p,r,t;

    Scanner ob = new Scanner(System.in);
    System.out.print("Enter a Principal :");
    p = ob.nextInt();

    System.out.print("Enter a Rate :");
    r = ob.nextInt();

    System.out.print("Enter a Time :");
    t = ob.nextInt();

   si=(p*r*t)/100;

   System.out.println("Simple interest :"+si);
    }
}
