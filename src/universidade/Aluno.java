package universidade;

public class Aluno extends Pessoa implements Receita {
    private String ra;
    private String curso;
    private double mensalidade;

    public Aluno(int id, String nome, String cpf, String ra, String curso, double mensalidade) {
        super(id, nome, cpf);
        this.ra = ra;
        this.curso = curso;
        this.mensalidade = mensalidade;
    }

    @Override
    public double getRecita() {
        return mensalidade;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public double getMesnsalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }
}
