import java.util.Scanner;

public class exercitiu {
    static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int a;
        a= myScanner.nextInt();
        if (a % 5 == 0) {
            System.out.println("a este divizibil cu 5");
        }
        else {
            System.out.println(" a nu este divizibil cu 0");
        }
    }
}
