import java.util.Scanner;

public class ex3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x >= 18) {
            System.out.println("Felicitari esti adult");
        } else {
            System.out.println("Imi pare rau,dar esti minor");
        }
    }
}
