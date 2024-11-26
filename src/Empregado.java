package src;

public class Empregado {
    protected String nome;
    protected String endereco;
    protected double salario;

    // Constructor
    public Empregado(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos de acesso
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularIrpf(){
        double aux;
        if (salario < 1000) {
            aux = 0.1 * salario;
        } else {
            aux = 0.27 * salario;
        }
        return (aux);
    }

    public double calcularInss() {
        return (0.11 * salario);
    }
}