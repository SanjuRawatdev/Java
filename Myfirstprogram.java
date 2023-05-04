import java.util.Scanner;
class Myfirstprogram{
  public static void main(String array[]) {
    int a , b;
    Scanner hello = new Scanner(System.in);
    System.out.print("enter one no. ");
    a = hello.nextInt();
    System.out.print("enter two no. ");
    b = hello.nextInt();
    System.out.print("your no is " + a+ " and " +b);
  }
}