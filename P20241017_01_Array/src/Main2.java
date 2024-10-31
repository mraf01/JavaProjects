
public class Main2 {

	public static void main(String[] args) {
		if (args==null) {
			//non hai passato parametri
		} else {
			System.out.println(args.length);
		}
		/*
		 * Un array è una struttura dati staticamente definita
		 * è organizzata come sequenza contigua di memoria
		 * è accessibile tramite indice (in analogia agli insiemi di python)
		 * Contrariamente agli insiemi di python gli array in java sono
		 * 1) a dimensione fissa (definita a tempo di creazione dell'array)
		 * 2) non modificabili nelle dimensioni
		 * 3) ad accesso diretto dei singoli elementi. I tempi di accesso
		 *    sono confrontabili con la velocità della CPU
		 * 4) gli elementi di un array in Java sono tutti dello stesso tipo 
		 * 	  (ricordate che Java è un linguaggio fortemente tipizzato)
		 * 5) Ricordate che in Java quando dichiaro una variabile senza
		 *    assegnarle un valore, prende il valore di default
		 *    per gli interi e i decimali è 0
		 *    per le stringhe e gli oggetti in genere è null
		 *    per gli array è ovviamente null
		 */
		
		int[] v;
		
		v = new int[100];  //ho dichiarato un array di interi e gli 
		 				   //ho assegnato un array di 100 elementi
		System.out.println(v);
		
//		Main[] programmi = new Main[100];
//		programmi[55].main(null);
		
		v[4]=100;
		v[90]=200;
		v[0]=v[4]+v[90];
		
		int j=10;
		v[j]=v[9*j];
		
		//Come scandire un array?
		
		//Inserire nell'array v (di 100 elementi interi)
		//i numeri da 0 a 99
		for (int k=0; k<100; k++) {
			v[k]=k;
		}
		
		//Quanto è lungo un array già dichiarato?
		System.out.println(v.length);
		
		//Quindi potrei scrivere
		for (int i=0; i<v.length; i++) {
			v[i]=i;
		}
		
		//Riempire un array di numeri casuali
		for (int i=0; i<v.length; i++) {
			v[i] = (int)(Math.random()*1000);
		}
		
		//Dichiarare un array di 1000 double
		//inserire nell'array 1000 valori casuali 
		//compresi tra 0 e 100 : Math.random()*100
		//contare quanti elementi dell'array sono
		//minori di 50
		
		//In python
		//Dichiarare una lista
		//inserire nella lista 1000 valori casuali
		//compresi tra 0 e 100
		//contare quanti elementi della lista sono
		//minori di 50

		String s="Ciao";
		System.out.printf("Hello world: %d, e poi %s\n", 1, s);
		
		
		
		//Dato l'array di double precedentemente inizializzato con 
		//i valori casuali
		//1) Calcolare la somma dei numeri presenti nell'array
		//2) Calcolare la media dei numeri presenti nell'array
		//   media = somma/lunghezza array
		//3) Calcolare quante volte il numero successivo è 
		//   maggiore del precedente
		//   Esempio: [1,4,6,3,1,2,1,8]
		//              x x     x   x 4 volte
		//4) Opzionale: calcolare la lunghezza della più lunga sequenza
		//              di numeri crescenti
		//	Esempio [1,4,6,3,1,2,1,8] 
		// più lunga sequenza di valori crescenti: 1,4,6
		//
		//Inserisco i valori casuali compresi tra 0.0 e 1000.0
		double [] v1 = new double[1000];
		for (int i=0; i<v1.length; i++) {
			v1[i] = Math.random()*1000;
		}
		
		//Calcolo e stampo la somma di tutti gli elementi del vettore
		double somma=0.0;
		for (int i=0; i<v1.length; i++) {
			somma += v1[i];
		}
		System.out.println("Somma: " + somma);
		
		//calcolo la media
		System.out.println("Media: " + somma / v1.length);
		
		//Calcolo quante volte il successivo è maggiore del precedente
		int quanteVolteMaggiore=0;
		for (int i=0; i<v1.length-1; i++) {
			if (v1[i+1]>v1[i]) {
				quanteVolteMaggiore++;
			}
		}
		System.out.println("Quante volte maggiore: " + quanteVolteMaggiore);
		
		//Sequenza più lunga
		int lunghezzaPiùLunga=0;
		int posizionePiùLunga=0;
		int contatoreSequenzaAttuale=1;
		int posizioneSequenzaAttuale=0;
		
		for (int i=1; i<v1.length; i++) {
			if (v1[i]>v1[i-1]) {
				contatoreSequenzaAttuale++;
			} else {
				if (contatoreSequenzaAttuale>lunghezzaPiùLunga) {
					lunghezzaPiùLunga=contatoreSequenzaAttuale;
					posizionePiùLunga=posizioneSequenzaAttuale;
				}
				contatoreSequenzaAttuale=0;
				posizioneSequenzaAttuale=i;
			}
		}
		//Devo verificare se in uscita abbiamo un valore migliore
		if (contatoreSequenzaAttuale>lunghezzaPiùLunga) {
			lunghezzaPiùLunga=contatoreSequenzaAttuale;
			posizionePiùLunga=posizioneSequenzaAttuale;
		}
		
		System.out.printf("Sequenza più lunga inizia in %d ed è lunga %d\n",
				posizionePiùLunga, lunghezzaPiùLunga);
	
	}

}