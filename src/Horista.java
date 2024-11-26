package src;

public class Horista extends Empregado {
    
    private double horas;

    // Constructor
    public Horista(String n, String e, double h) {
        super(n, e);
        horas = h;
    }

    // Metodos de acesso
    public void set_horas(double h) {
        horas = h;
    }
    public double get_horas() {
        return horas;
    }
    public void calcularSalario() {
        salario = horas * 50;
    }
}
