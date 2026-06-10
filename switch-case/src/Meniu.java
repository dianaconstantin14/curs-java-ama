import java.util.Scanner;

public class Meniu {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Spuneti numarul");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("Pizza");
                break;
            case 2:
                    System.out.println("Burger");
                    break;
            case 3:
                System.out.println("Shaorma");
                break;
            case 4:
                System.out.println("Paste");
                break;
            case 5:
                System.out.println("Salata");
                break;
            case 6:
                System.out.println("Supa");
                break;
            case 7:
                System.out.println("Desert");
                break;
            default:
                System.out.println("Introduceti un mesaj cu un numar de la 1 la 7");
        }
    }
}
/*Se citeste de la tastatura un numar n, reprezentand codul unui produs din meniu.

Sa se afiseze numele produsului corespunzator codului introdus, conform listei:

1. Pizza
2. Burger
3. Shaorma
4. Paste
5. Salata
6. Supa
7. Desert
*/