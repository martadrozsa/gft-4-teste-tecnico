/*
1. Desenvolva um programa que continue lendo uma senha até que ela seja válida.
Caso a senha estiver errada, escreva no console “Senha Inválida” e ler novamente o próximo input.
Quando ler a senha correta deve escrever no console “Acesso garantido” e finalizar a aplicação.
A senha correta é 2018.
*/

import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int senha = sc.nextInt();
        int senhaValida = 2018;

        while (senha != senhaValida) {
            System.out.println("Senha Inválida");
            senha = sc.nextInt();
        }
        System.out.println("Acesso garantido");
        sc.close();
    }
}
