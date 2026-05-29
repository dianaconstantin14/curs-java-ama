import java.util.Scanner;

public class ex8 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 100) {
            System.out.println("Produsul este la reducere");
        } else {
            System.out.println("Produsul este la pret intreg");
        }
    }
}
