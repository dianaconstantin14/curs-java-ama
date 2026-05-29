import java.util.Scanner;

// sa se afiseze ziua saptamanii in functie de numarul x
public class Main {
    static void main(String[] args) {
        Scanner gigi = new Scanner(System.in);
        int gogu;
        gogu = gigi.nextInt();
        if (gogu == 1) {
            System.out.println("Luni");
        } else if (gogu == 2) {
            System.out.println("Marti");
        } else if (gogu == 3) {
            System.out.println("Miercuri");
        } else if (gogu == 4) {
            System.out.println("Joi");
        } else if (gogu == 5) {
            System.out.println("Vineri");
        } else if (gogu == 6) {
            System.out.println("Sambata");
        } else if (gogu == 7) {
            System.out.println("Duminica");
        }
    }
}
