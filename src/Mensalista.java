package src;

public class Mensalista extends Empregado {
    private String cargo;

    // Constructor
    public Mensalista(String n, String e, String c) {
        super(n, e);
        cargo = c;
    }

    // Métodos de acesso
    public void set_cargo(String c) {
        cargo = c;
    }

    public String get_cargo() {
        return (cargo);
    }

    public void calcularSalario() {
        if (cargo.equals("Junior")) {
            salario = 2500;
        } else if (cargo.equals("Pleno")) {
            salario = 3500;
        } else if (cargo.equals("Senior")) { // Erro encontrado: não havia verificação para string  "Senior", portanto, qualquer string poderia se enquadrar neste else.
            salario = 5500;
        } else {
            System.out.println("Cargo incorreto");
        }
    }
}
