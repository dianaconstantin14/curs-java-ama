import java.util.Scanner;

public class Tara {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x){
            case 1:
                System.out.println("Romania");
break;
            case 2:
                System.out.println("Bulgaria");
                break;
            case 3:
                System.out.println("Anglia");
                break;
            case 4:
                System.out.println("Germania");
                break;
            case 5:
                System.out.println("Spania");
                break;
            case 6:
                System.out.println("Franta");
                break;
            case 7:
                System.out.println("Italia");
                break;
            default:
                System.out.println("Tara nu corespunde codului introdus");
        }
    }
}
