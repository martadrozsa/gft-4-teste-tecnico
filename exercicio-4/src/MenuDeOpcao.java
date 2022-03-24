
/*
4. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Soma
2. IMC
3. Sair
Digite a opção desejada:
Na opção 1: receber dois números, calcular e mostrar a soma.
Na opção 2: receber peso e altura, calcular e mostrar o seguinte resultado:
a) Se menor que 18.5 mostrar o resultado e escrever “Peso abaixo do normal”.
b) Se entre 18.5 e 25 mostrar o resultado e escrever “Peso normal”.
c) Se maior que 25 até 30 mostrar o resultado e escrever “Sobre o peso”.
d) Se maior que 30 até 35 mostrar o resultado e escrever “Grau de obesidade I”.
Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.
*/

import java.util.Scanner;

public class MenuDeOpcao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma opção: 1.Soma  2.IMC  3.Sair");
        int opcao =  sc.nextInt();


        if (opcao == 1) {
            System.out.println("Digite o primeiro número");
            int num1 = sc.nextInt();
            System.out.println("Digite o segundo número");
            int num2 = sc.nextInt();

            int resultadoSoma = calculaSoma(num1, num2);
            System.out.println("Soma = " + resultadoSoma);
        }
        else if (opcao == 2) {
            System.out.println("Informe o peso: ");
            double peso = sc.nextDouble();
            System.out.println("Informe a aultura: ");
            double altura = sc.nextDouble();
            calculaIMC(peso, altura);
        }
        else if (opcao == 3) {
            System.exit(3);
        }
        else {
            System.out.println("Essa opção não é válida!");
        }
    }


    public static int calculaSoma(int num1, int num2) {
        return num1 + num2;
    }

    public static void calculaIMC(double peso, double altura) {
        double imc = peso / Math.pow(altura, 2);

        if(imc < 18.5) {
            System.out.println("Peso abaixo do normal");
        }else if(imc > 18.5 && imc < 25) {
            System.out.println("Peso normal");
        }else if(imc > 25 && imc < 30) {
            System.out.println("Sobre o peso");
        }else if(imc > 30 && imc < 35) {
            System.out.println("Grau de obesidade I");
        }
    }
}
