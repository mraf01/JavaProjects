//Calcolo dell'ipotenusa di un triangolo rettangolo

 /*

 * Sia dato un triangolo rettangolo i cui cateti misurano rispettivamente 10.345 e 20.415 cm

 * Calcolare

 * 1) la lunghezza dell'ipotenusa

 * 2) il perimetro del triangolo rettangolo

 * 3) L'area del triangolo rettangolo

 * NB:

 * a) Teorema di pitagora

 * dati c1 w c2 cateti di un triangolo rettangolo, l'ipotenusa è la radice quadrata della somma dei quadrati dei cateti

 * b) In java la rqdica quadrata si calcola con Math.sqrt(numero)

 */


public class Pitagora {

    public static void main(String[] args) {
        
        double c1 = 10.345;
        double c2 = 20.415;

        double c1Squared = c1 * c1;
        double c2Squared = c2 * c2;
        double ipotenusa = Math.sqrt(c1Squared + c2Squared);
        
        double perimetro = c1 + c2 + ipotenusa;
        
        double area = (c1 * c2) / 2;

        System.out.println("Lunghezza dell'ipotenusa: " + ipotenusa + " cm");
        System.out.println("Perimetro del triangolo rettangolo: " + perimetro + " cm");
        System.out.println("Area del triangolo rettangolo: " + area + " cm²");
    }
}
