
public class Cibo {
    private String nome;
    private int calorie;

    public Cibo(String nome, int calorie) {
        this.nome = nome;
        this.calorie = calorie;
    }

    public String getNome() {
        return nome;
    }

    public int getCalorie() {
        return calorie;
    }

    @Override
    public String toString() {
        return nome + " (" + calorie + " kcal)";
    }
}