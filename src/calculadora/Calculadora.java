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
        int operacao;
        Operacoes calculo = null;
        Scanner ler = new Scanner(System.in);

        System.out.println("Calculadora ");
        System.out.println("1- Soma");
        System.out.println("2- Subtração");
        System.out.println("3- Divisão");
        System.out.println("4- Multiplicação");
        System.out.println("Selecione a operação: ");
        operacao = ler.nextInt();

        System.out.println("Digite o primeiro numero: ");
        n1 = ler.nextDouble();

        System.out.println("Digite o segundo numero: ");
        n2 = ler.nextDouble();
        
        switch (operacao) {
            case 1 -> calculo = new Soma();
            case 2 -> calculo = new Subtracao();
            case 3 -> calculo = new Divisao();
            case 4 -> calculo = new multiplicacao();
        }

        fazCalculo(calculo, n1, n2);
        ler.close();
    }
    
    public static void fazCalculo(Operacoes calculo, double n1, double n2){
        double resultadoCalculo;
        resultadoCalculo = calculo.resultado(n1, n2);
        
        System.out.println("O resultado da operação é: " + resultadoCalculo + "\n");   
    }
}
