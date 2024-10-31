
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Cibo[] menu = new Cibo[5];
        menu[0] = new Cibo("Pasta e Ceci", 450);
        menu[1] = new Cibo("Lombata", 650);
        menu[2] = new Cibo("Sogliola", 300);
        menu[3] = new Cibo("Pesce Persico", 350);
        menu[4] = new Cibo("Delizia al Limone", 500);

        System.out.println("Menu:");
        for (Cibo cibo : menu) {
            System.out.println(cibo);
        }

        int calorieTotali = 0;
        for (Cibo cibo : menu) {
            calorieTotali += cibo.getCalorie();
        }
        System.out.println("\nCalorie totali del menu: " + calorieTotali + " kcal");

        Random random = new Random();
        Cibo[][] pranzo50Persone = new Cibo[50][3];

        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 3; j++) {
                pranzo50Persone[i][j] = menu[random.nextInt(menu.length)];
            }
        }

        System.out.println("\nPranzo per 50 persone:");
        for (int i = 0; i < 50; i++) {
            System.out.print("Persona " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(pranzo50Persone[i][j].getNome() + " ");
            }
            System.out.println();
        }
    }
}
