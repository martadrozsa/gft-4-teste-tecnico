/*
2. Escreva um programa onde o usuário digite um valor inteiro e o programa escreva
a música do “Elefante incomoda” correspondente ao valor digitado:
Exemplo: Usuário digitou o no 3
Saída: Incomoda Incomoda Incomoda muito mais
*/

import java.util.Scanner;

public class Elefante {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.print("Incomoda ");
        }
        System.out.println("muito mais");
        sc.close();
    }
}
