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

    // Atualizado o cálculo de imposto de renda e do inss
    
    public double calcularIrpf(double salario) {
        double imposto = 0.0;

        if (salario <= 1903.98) {
            imposto = 0.0;
        } else if (salario <= 2826.65) {
            imposto = (salario - 1903.98) * 0.075;
        } else if (salario <= 3751.05) {
            imposto = (salario - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else if (salario <= 4664.68) {
            imposto = (salario - 3751.05) * 0.225 + (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        } else {
            imposto = (salario - 4664.68) * 0.275 + (4664.68 - 3751.05) * 0.225 + 
                      (3751.05 - 2826.65) * 0.15 + (2826.65 - 1903.98) * 0.075;
        }

        return imposto;
    }

    public double calcularInss() {
        double inss = 0;

        if (salario > 0 && salario < 1659.38) {
            inss = 0.08 * salario;
        } else if (salario >= 1659.38 && salario < 2765.66) {
            inss = 0.09 * salario;
        } else if (salario > 2765.66) {
            inss = 0.11 * salario;
        }

        return inss;
    }
}