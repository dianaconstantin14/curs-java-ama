import java.util.Scanner;

/*Se citeste un numar n si un numar x
numarul n reprezinta numarul de mere pe care ion le are
numarul x reprezinta numarul de copii.
Daca Ion imparte merele in mod egal la fiecare copil, cu cate mere ramane?
*/
public class exercitiu {
    static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n, x, y;
        System.out.println("Introduceti numarul de mere");
        n = myScanner.nextInt();
        System.out.println("Introduceti numarul de copii");
        x = myScanner.nextInt();
        y = n % x;
        if (y == 1) {
            System.out.println("Ion ramane cu 1 mar");
        } else if (y == 0) {
            System.out.println("Ion ramane fara mere.");
        } else {
            System.out.println("Ion ramane cu " + y + " mere.");
        }
    }
}