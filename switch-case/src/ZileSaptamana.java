import java.util.Scanner;

    public class ZileSaptamana{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String[] zile = {
                    "Luni",
                    "Marti",
                    "Miercuri",
                    "Joi",
                    "Vineri",
                    "Sambata",
                    "Duminica"
            };

            System.out.print("Introdu un numar natural: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Te rog introdu un numar natural pozitiv!");
            } else {
                int index = (n - 1) % 7;  // ca sa porneasca de la Luni
                System.out.println("Ziua corespunzatoare este: " + zile[index]);
            }

            sc.close();
        }
    }
