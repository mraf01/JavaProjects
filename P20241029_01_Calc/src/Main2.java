
public class Main2 {

    public static void main(String[] args) {
        String esempio = "4+5*2-1";
        
        esempio = esempio.replaceAll(" ", "");
        System.out.println("Stringa pulita: " + esempio);

        String[] numeri = esempio.split("[\\+\\-\\*\\/]");
        String[] operatori = esempio.split("[0-9]+");

        int risultato = Integer.parseInt(numeri[0]);

        int indexOperatore = 1;
        for (int i = 1; i < numeri.length; i++) {
            int operando = Integer.parseInt(numeri[i]);
            String operatore = operatori[indexOperatore];

            switch (operatore) {
                case "+":
                    risultato += operando;
                    break;
                case "-":
                    risultato -= operando;
                    break;
                case "*":
                    risultato *= operando;
                    break;
                case "/":
                    if (operando != 0) {
                        risultato /= operando;
                    } else {
                        System.out.println("Errore: Divisione per zero non consentita.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operatore non riconosciuto.");
                    return;
            }
            indexOperatore++;
        }
        
        System.out.println("Risultato: " + risultato);
    }
}
