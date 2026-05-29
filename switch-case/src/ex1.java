import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(x > 0){
            System.out.println("Numarul este pozitiv");
        }
        else {
            System.out.println("Numarul este negativ");
        }
    }
}
