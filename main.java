import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<funcionario> funcionarios = new ArrayList<>();
        List<departamento> departamentos = new ArrayList<>();

        funcionarios.add(new funcionario(1, "Marcelo", 1500, "arquiteto", 101));
        funcionarios.add(new funcionario(2, "Douglas", 1505, "gerente", 102));
        funcionarios.add(new funcionario(3, "Aela", 1000, "segurança", 101));
        funcionarios.add(new funcionario(4, "Marcia", 19000, "diretor", 103));

        
        departamentos.add(new departamento(101, "Vendas", 550000));
        departamentos.add(new departamento(102, "Marketing", 90000));
        departamentos.add(new departamento(103, "Segurança", 19500));
    }
}