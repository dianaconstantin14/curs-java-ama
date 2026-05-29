import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
      Scanner myScanner = new Scanner(System.in);
        int a;
      System.out.println(" Introduceti numarul: ");
        a = myScanner.nextInt();
        if ( a < 40) {
            System.out.println("a < 40");
        } else if( a > 40) {
            System.out.println("a > 40");
        }   else {
            System.out.println("a == 40");
        }
    }
}