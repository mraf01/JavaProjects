import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*
         * Un array è una struttura dati staticamente definita
         * è organizzata come sequenza continua di memoria
         * è accessibile tramite indice (in analogia agli insiemi di python)
         * Contrariamente agli insiemi di python gli array in java sono
         * 1) a dimensione fissa (definita a tempo di creazione dell'array)
         * 2) non modificabili nelle dimensioni
         * 3) ad accesso diretto dei singoli elementi. I tempi di accesso
         *    sono confrontabili con la velocità della CPU
         * 4) gli elementi di un array in Java sono tutti dello stesso tipo
         *    (ricordate che Java è un linguaggio fortemente tipizzato)
         * 5) Ricordate che in Java quando dichiaro una variabile senza
         *    assegnarle un valore, prende il valore di default
         *    per gli interi e i decimali è 0
         *    per le stringhe e gli oggetti in genere è null
         *    per gli array è ovviamente null 
         */

        int[] v;

        v = new int[100]; // ho dichiarato un array di interi e gli
                          // ho assegnato un array di 100 elementi
        System.out.println(v);

        // Main[] programmi = new Main[100];
        // programmi[55].main(null);

        v[4] = 100;
        v[90] = 200;
        v[0] = v[4] + v[90];

        int i = 10;
        v[i] = v[9 * i];

        // Come scandire un array?

        // Inserire nell'array v (di 100 elementi interi)
        // i numeri da 0 a 99
        for (int k = 0; k < 100; k++) {
            v[k] = k;
        }

        // Quanto è lungo un array già dichiarato?
        System.out.println(v.length);

        // Quindi potrei scrivere
        for (i = 0; i < v.length; i++) {
            v[i] = i;
        }

        // Riempire un array di numeri casuali
        for (i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 1000);
        }

        // Dichiarare un array di 1000 double
        // inserire nell'array un valore casuale
        // compreso tra 0 e 100 : Math.random()*100
        // contare quanti elementi dell'array sono
        // minori di 50

        // Dichiarare un array di 1000 double
        double[] array = new double[1000];
        int count = 0;

        // Inserire valori casuali nell'array (compresi tra 0 e 100)
        for (i = 0; i < array.length; i++) {
            array[i] = Math.random() * 100;

            // Contare quanti elementi sono minori di 50
            if (array[i] < 50) {
                count++;
            }
        }

        System.out.println("Numero di elementi minori di 50: " + count);

        /* in Python

        array = [0] * 1000
        count = 0

        for i in range(len(array)):
            array[i] = random.random() * 100
            if array[i] < 50:
                count += 1

        print("Numero di elementi minori di 50:", count)
        */

        // Dato l'array di double precedentemente inizializzato con
        // i valori casuali
        // 1) Calcolare la somma dei numeri presenti nell'array
        // 2) Calcolare la media dei numeri presenti nell'array
        //    media = somma/lunghezza array
        // 3) Calcolare quante volte il numero successivo è
        //    maggiore del precedente
        //    Esempio: [1, 4, 6, 3, 1, 2, 1, 8]
        //              x  x        x     x 4 volte
        // 4) Opzionale: calcolare la lunghezza della più lunga sequenza
        //               di numeri crescenti
        // Esempio [1,4,6,3,1,2,1,8]
        // più lunga sequenza di valori crescenti: 1,4,6

        // Inizializzazione dell'array di double con valori casuali
        Random random = new Random();
        int n = 10; // dimensione dell'array
        double[] randomArray = new double[n];

        // Riempire l'array con valori casuali compresi tra 0 e 10
        for (i = 0; i < n; i++) {
            randomArray[i] = random.nextDouble() * 10;
            System.out.print(randomArray[i] + " ");
        }
        System.out.println();

        // 1) Calcolare la somma dei numeri presenti nell'array
        double somma = 0;
        for (double num : randomArray) {
            somma += num;
        }
        System.out.println("Somma: " + somma);

        // 2) Calcolare la media dei numeri presenti nell'array
        double media = somma / randomArray.length;
        System.out.println("Media: " + media);

        // 3) Calcolare quante volte il numero successivo è maggiore del precedente
        int countMaggiore = 0;
        for (i = 0; i < randomArray.length - 1; i++) {
            if (randomArray[i + 1] > randomArray[i]) {
                countMaggiore++;
            }
        }
        System.out.println("Numero di volte in cui un elemento è maggiore del precedente: " + countMaggiore);

        // 4) Calcolare la lunghezza della più lunga sequenza di numeri crescenti
        int maxLunghezzaSequenza = 1; // Lunghezza massima trovata
        int lunghezzaCorrente = 1; // Lunghezza della sequenza corrente

        for (i = 0; i < randomArray.length - 1; i++) {
            if (randomArray[i + 1] > randomArray[i]) {
                lunghezzaCorrente++;
            } else {
                if (lunghezzaCorrente > maxLunghezzaSequenza) {
                    maxLunghezzaSequenza = lunghezzaCorrente;
                }
                lunghezzaCorrente = 1; // resetta la sequenza
            }
        }

        // Controllo finale per aggiornare la massima lunghezza
        if (lunghezzaCorrente > maxLunghezzaSequenza) {
            maxLunghezzaSequenza = lunghezzaCorrente;
        }

        System.out.println("Lunghezza della più lunga sequenza di numeri crescenti: " + maxLunghezzaSequenza);
    }
}
