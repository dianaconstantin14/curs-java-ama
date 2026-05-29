
import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("Numar par");
        } else {
            System.out.println("Numar impar");
        }
    }
}

