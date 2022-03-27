package calculadora;

import java.util.Scanner;

/**
 *
 * @author Ana
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        double n1, n2, resultado;

        System.out.println("Digite o primeiro numero: ");
        Scanner ler = new Scanner(System.in);
        n1 = ler.nextDouble();

        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextDouble();
        
        Operacoes result = new Operacoes();
        
        resultado = result.soma(n1, n2);
        System.out.println("A soma dos numeros é: "+ resultado);
        
        resultado = result.subtracao(n1, n2);
        System.out.println("A subtracao dos numeros é: "+ resultado);
        
        resultado = result.multiplicacao(n1, n2);
        System.out.println("A multiplicação dos numeros é: "+ resultado);
        
        resultado = result.divisao(n1, n2);
        System.out.println("A divisao dos numeros é: "+ resultado);
    }

}
