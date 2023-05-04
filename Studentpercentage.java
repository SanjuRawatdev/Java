    import java.util.*;
class Studentpercentage {
    public static void main(String arr[]){
    int t,h,e,m;
    float per;

    Scanner ob = new Scanner(System.in);
    System.out.print("Enter a marks hindi , english , math :");
    h = ob.nextInt();
    e = ob.nextInt();
    m = ob.nextInt();
   t=h+e+m;

   per=(t*100)/300;
   
   System.out.println("Total marks :"+t);
   System.out.println("Percentage marks :"+per);

    }

}
