package universidade;

public class Professor extends Pessoa implements Despesa{
    private int funcional;
    private String diciplina;
    private double salario;

    public Professor(int id, String nome, String cpf, int funcional, String diciplina, double salario) {
        super(id, nome, cpf);
        this.funcional = funcional;
        this.diciplina = diciplina;
        this.salario = salario;
    }
    @Override
    public double getDespesa() {
        return salario;
    }
    public int getFuncional() {
        return funcional;
    }
    public void setFuncional(int funcional) {
        this.funcional = funcional;
    }
    public String getDiciplina() {
        return diciplina;
    }
    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
