public class Main {
    public static void main(String[] args) {
        // Crea un'istanza di TriangoloRettangolo con due cateti
        TriangoloRettangolo tr = new TriangoloRettangolo(1, 2);
        
        // Stampa l'area del triangolo
        System.out.println("Area del triangolo: " + tr.Area());
        
        // Stampa il perimetro del triangolo
        System.out.println("Perimetro del triangolo: " + tr.Perimetro());
    }
}