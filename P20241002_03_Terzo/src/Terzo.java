
public class Terzo {

	public static void main(String[] args) {
		System.out.println("Primo");
		System.out.println("Secondo");
		System.out.println("Terzo");
		
		int pippo;
		
		pippo = 100;
				
		System.out.println(pippo);
		/*
		 * Estendere questo programma dichiarando una variabile intera di
		 * nome pluto, assegnandole il valore 200 e stampare la somma
		 * tra pippo e pluto
		 */
		
		int pluto = 200;
		int somma = pippo + pluto;
		
		System.out.println("Somma di pippo e pluto: " + somma);		
		
		// Ora...
        // int è grande 4 byte e gestisce sia i positivi che i negativi
        int numerone = 2147483647;
        System.out.println("Numerone vale: " + numerone);

        numerone = numerone + 1;
        System.out.println("Numerone+1 vale: " + numerone);

        numerone = numerone + 1;
        System.out.println("Numerone+1 vale: " + numerone);

        // I tipi di dato interi
        byte b; // 1 byte
        short s; // 2 byte
        int i; // 4 byte
        long l; // 8 byte

        // I tipi di dato reali
        float f; // 4 byte
        double d; // 8 byte

        int n1, n2;
        n1 = 10;
        n2 = 4;
        System.out.println(n1 / n2);

        double dn1, dn2;
        dn1 = n1;
        dn2 = n2;
        System.out.println(dn1 / dn2);

        n1 = 23;
        n2 = 4;
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);
    }
}
