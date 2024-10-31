
public class Main {

    public static void main(String[] args) {
        String esempio = " 123 + 876 ";
        
        esempio = esempio.replaceAll(" ", "");
        System.out.println("Stringa pulita: " + esempio);

        if (esempio.matches(".*[\\+\\-\\*\\/].*")) {
            String[] operandi = esempio.split("[\\+\\-\\*\\/]");
            int operando1 = Integer.parseInt(operandi[0]);
            int operando2 = Integer.parseInt(operandi[1]);

            String[] voperatore = esempio.split("[0-9]+");
            String operatore = voperatore[1];

            int risultato = 0;
            switch (operatore) {
                case "+":
                    risultato = operando1 + operando2;
                    break;
                case "-":
                    risultato = operando1 - operando2;
                    break;
                case "*":
                    risultato = operando1 * operando2;
                    break;
                case "/":
                    if (operando2 != 0) {
                        risultato = operando1 / operando2;
                    } else {
                        System.out.println("Errore: Divisione per zero non consentita.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operatore non riconosciuto.");
                    return;
            }
            System.out.println("Risultato: " + risultato);

        } else {
            int valore = Integer.parseInt(esempio);
            System.out.println("Valore singolo: " + valore);
        }
    }
}
