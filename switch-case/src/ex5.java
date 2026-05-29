import java.util.Scanner;

public class ex5 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        if (x >= 5) {
            System.out.println("Felicitari,ai promovat examenul!");
        } else {
            System.out.println("Imi pare rau,dar ai picat!");
        }
    }
}
