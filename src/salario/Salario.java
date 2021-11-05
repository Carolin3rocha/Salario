
package salario;


public class Salario {
/* Inicio
    Entrada de dados
    double SalarioInicial
    double Aumento = SalarioInicial * 15.3 /100
    double SalarioFinal = SalarioInicial + Aumento
    Processamento
    Imprimir SalarioFinal
    FIM
    */
    
    public static void main(String[] args) {
        
        double salarioInicial = 2000;
        double aumento = (salarioInicial * 15.3) /100;
        double salarioFinal = salarioInicial + aumento;
        
        System.out.println("Novo salario é : R$" + salarioFinal);
        
    }
    
}
