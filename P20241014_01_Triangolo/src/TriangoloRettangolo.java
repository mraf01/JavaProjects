public class TriangoloRettangolo {
    double cat1; // Primo cateto del triangolo
    double cat2; // Secondo cateto del triangolo
    double ipot; // Ipotenusa del triangolo

    // Costruttore
    public TriangoloRettangolo(double cat1, double cat2) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.ipot = Math.sqrt(cat1 * cat1 + cat2 * cat2); // Calcola l'ipotenusa usando il teorema di Pitagora
    }

    // Metodo per calcolare l'area del triangolo
    double Area() {
        return (cat1 * cat2) / 2.0; // Formula per l'area di un triangolo rettangolo
    }

    // Metodo per calcolare il perimetro del triangolo
    double Perimetro() {
        return cat1 + cat2 + ipot; // Formula per il perimetro
    }
}