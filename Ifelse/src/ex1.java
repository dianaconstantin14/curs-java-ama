
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("pozitiv");
        }
        else if (x < 0) {
            System.out.println("negativ");
        }
        else {
            System.out.println("zero");
        }
    }
}


/*
 import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x % 2 == 0)
        System.out.println("Numar par");
        else
        System.out.println("Numar impar");
    }
}

 import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 10)
        System.out.printf("Numar mare");
          else
        System.out.println("Numar mic");
    }
}
 import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 18)
            System.out.printf("Major");
        else
            System.out.printf("Minor");
    }
}



public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y)
            System.out.println(x);
        else if (y > x)
            System.out.println(y);
        else
            System.out.println("egale");
    }
}

 */