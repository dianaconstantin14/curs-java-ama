import java.util.Scanner;

public class ex4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 100) {
            System.out.println("Este mai mare de 100");
        } else {
            System.out.println("Este sub 100");
        }
    }
}
