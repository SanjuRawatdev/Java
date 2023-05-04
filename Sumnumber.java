import java.util.Scanner;
class Sumnumber{
  public static void main(String array[]) {
    int a , b ,sum=0;
    Scanner hello = new Scanner(System.in);

    System.out.print("enter one no. ");
    a = hello.nextInt();

    System.out.print("enter two no. ");
    b = hello.nextInt();

    sum = a + b;
    System.out.print("Two number is sum : "+sum);
  }
}

