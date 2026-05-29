import java.util.Scanner;

public class MainSwitch {
    public static void main(String[] args) {
        Scanner gigi = new Scanner(System.in);
        System.out.print("Introdu un numar natural: ");

        int gogu = gigi.nextInt();

        if (gogu <= 0) {
            System.out.println("Numarul introdus nu este natural.");
            return;
        }

        int zi = gogu % 7;

        switch (zi) {
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            case 5:
                System.out.println("Vineri");
                break;
            case 6:
                System.out.println("Sambata");
                break;
            case 0:
                System.out.println("Duminica");
                break;
        }
    }
}

