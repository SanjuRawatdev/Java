import java.util.*;
class Demo {
    public static void main(String arr[]){
        float r,area=0,permitre=0,pi=3.14f;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a no. ");
        r = ob.nextFloat();
        area = pi*r*r;
        permitre = 2*pi*r;
        System.out.println("Area = "+area);
        System.out.println("Permiter = "+permitre);

    }
}