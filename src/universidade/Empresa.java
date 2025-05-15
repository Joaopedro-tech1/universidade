package universidade;

public class Empresa extends Entedidade implements Receita, Despesa{
    private String cnpj;
    private double receita;
    private double despesa;

    public Empresa(int id, String nome, String cnpj, double receita, double despesa) {
        super(id, nome);
        this.cnpj = cnpj;
        this.receita = receita;
        this.despesa = despesa;
    }
    @Override
    public double getRecita() {
        return receita;
    }
    @Override
    public double getDespesa() {
        return despesa;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public double getReceita() {
        return receita;
    }
    public void setReceita(double receita) {
        this.receita = receita;
    }
    public void setDespesa(double despesa) {
        this.despesa = despesa;
    }

}
