package universidade;

abstract class Pessoa extends Entedidade{
    private String cpf;

    public Pessoa(int id, String nome, String cpf) {
        super(id, nome);
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDoc() {
        return cpf;
    }
}
