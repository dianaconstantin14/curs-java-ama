import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x >= 18) {
            System.out.println("Major");
        } else {
            System.out.println("Minor");
        }
    }
}
