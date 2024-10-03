import java.util.Scanner;

public class Cicli {

    public static void main(String[] args) {
        // Stampare i numeri interi da 0 a 10 (10 escluso)
        System.out.println("Numeri da 0 a 10 (escluso 10):");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Stampare la tabellina del 7
        // 1° modo
        System.out.println("\nTabellina del 7 (1° modo):");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }

        // 2° modo
        System.out.println("\nTabellina del 7 (2° modo):");
        for (int i = 7; i <= 70; i += 7) {
            System.out.println(i);
        }

        // 3° modo
        System.out.println("\nTabellina del 7 (3° modo):");
        for (int i = 7; i <= 70;) {  
            System.out.println(i);
            i = i + 7; // Incremento di 7
        }

        // 4° modo con due cicli for
        System.out.println("\nTabellina del 7 (4° modo con due for):");
        for (int i = 0; i < 70;) {
            for (int j = 0; j < 1; j++) {
                i += 7;
                System.out.println(i);
            }
        }

        // Determinare se un numero è pari o dispari
        System.out.println("\nVerifica se un numero è pari o dispari:");
        int n1 = 7;
        if (n1 % 2 == 0) {
            System.out.println(n1 + " è pari");
        } else {
            System.out.println(n1 + " è dispari");
        }

        // Leggere 10 numeri da tastiera e stampare per ognuno di loro se è maggiore o minore di 10
        Scanner leggi = new Scanner(System.in);
        int numero;

        System.out.println("\nInserisci 10 numeri e verifica se sono maggiori o minori di 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Inserisci il numero " + i + ":");
            numero = leggi.nextInt(); // Lettura del numero intero da tastiera

            // Controllo se il numero è maggiore, minore o uguale a 10
            if (numero > 10) {
                System.out.println(numero + " è maggiore di 10");
            } else if (numero < 10) {
                System.out.println(numero + " è minore di 10");
            } else {
                System.out.println(numero + " è uguale a 10");
            }
        }

        leggi.close(); // Chiudere lo Scanner per evitare perdite di memoria
    }
}
