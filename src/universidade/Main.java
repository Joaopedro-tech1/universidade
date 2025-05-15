package universidade;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno(1, "João Pedro", "123.456.789-00", "RA001", "Ciência da Computação", 1500.00);

        Professor professor = new Professor(2, "Maria Silva", "987.654.321-00", 1010, "Algoritmos", 5000.00);

        Empresa empresa = new Empresa(3, "Tech Solutions", "12.345.678/0001-99", 20000.00, 5000.00);

        System.out.println("=== RECEITAS ===");
        System.out.println("Receita do aluno " + aluno.getNome() + ": R$ " + aluno.getRecita());
        System.out.println("Receita da empresa " + empresa.getNome() + ": R$ " + empresa.getRecita());

        System.out.println("\n=== DESPESAS ===");
        System.out.println("Despesa com professor " + professor.getNome() + ": R$ " + professor.getDespesa());
        System.out.println("Despesa da empresa " + empresa.getNome() + ": R$ " + empresa.getDespesa());

        double totalReceitas = aluno.getRecita() + empresa.getRecita();
        double totalDespesas = professor.getDespesa() + empresa.getDespesa();
        double saldo = totalReceitas - totalDespesas;

        System.out.println("\n=== SALDO GERAL DA UNIVERSIDADE ===");
        System.out.printf("Saldo: R$ %.2f\n", saldo);
    }
}