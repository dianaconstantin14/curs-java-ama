import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti primul numar");
        int x = sc.nextInt();

        System.out.println("Introduceti al doilea numar");
        double y = sc.nextDouble();

        if (x > y) {
            System.out.println("Primul numar este mai mare");
        }
        else if (y > x) {
            System.out.println("Al doilea este mai mare");
        }
        else {
            System.out.println("egale");
        }
    }
}
