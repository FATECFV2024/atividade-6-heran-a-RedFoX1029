package src;

public class FolhaPGTO {

    public static void main(String args[]) {
        Mensalista men1, men2;
        Horista hora1, hora2;
        
        // Empregados mensalistas
        men1 = new Mensalista("Junior", "Rua ABC", "Junior");
        imprimirMensalista(men1);
        
        men2 = new Mensalista("Ana", "Rua sem fim", "Senior");
        imprimirMensalista(men2);

        // Empregados horistas
        hora1 = new Horista("Carlos", "Rua xyz", 20);
        imprimirHorista(hora1);
        
        hora2 = new Horista("Cristina", "Rua do centro  ", 100);
        imprimirHorista(hora2);
    }

    // Criados 2 métodos para imprimir as informações dos mensalistas e horistas
    public static void imprimirMensalista(Mensalista men) {
        men.calcularSalario();
        men.calcularInss();
        System.out.println("Nome: " + men.getNome());
        System.out.println("Endereço: " + men.getEndereco());
        System.out.println("Salario: " + men.getSalario());
    }
    
    public static void imprimirHorista(Horista hora) {
        hora.calcularSalario();
        hora.calcularIrpf(hora.getSalario());
        System.out.println("Nome: " + hora.getNome());
        System.out.println("Endereço: " + hora.getEndereco());
        System.out.println("Salario: " + hora.getSalario());
    }
}