public class funcionario {
    private int id;
    private String nome;
    private String cargo;
    private int departamentoId;
    private double salario;

    public funcionario(int id, String nome, double salario, String cargo, int departamentoId) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.departamentoId = departamentoId;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getDepartamentoId() {
        return departamentoId;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isGerente() {
        return "gerente".equalsIgnoreCase(cargo);
    }
}
