public class departamento {
    private int id;
    private String nome;
    private double valorVendas;

    public departamento(int id, String nome, double valorVendas) {
        this.id = id;
        this.nome = nome;
        this.valorVendas = valorVendas;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getValorVendas() {
        return valorVendas;
    }
}
