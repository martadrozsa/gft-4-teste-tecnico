/*
3. Utilizando laços de repetição crie uma aplicação que receba a idade e o peso de 10 pessoas.
Calcule e mostre as médias dos pesos das pessoas da mesma faixa etária.
As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e maiores de 31 anos.
*/

import java.util.Scanner;

public class CalculaPeso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double countEntre1e10 = 0;
        double countEntre11e20 = 0;
        double countEntre21e30 = 0;
        double countMaioresDe31= 0;

        double sumEntre1e10 = 0;
        double sumEntre11e20 = 0;
        double sumEntre21e30 = 0;
        double sumMaioresDe31= 0;

        for (int i = 0; i < 10; i++){
            System.out.print("Informe a idade: ");
            int idade = sc.nextInt();
            System.out.print("Informe o peso: ");
            double peso = sc.nextDouble();
            if (idade >= 1 && idade <= 10) {
                sumEntre1e10+= peso;
                countEntre1e10++;
            }
            else if (idade >= 11 && idade <= 20) {
                sumEntre11e20+= peso;
                countEntre11e20++;
            }
            else if (idade >= 21 && idade <= 30) {
                sumEntre21e30+= peso;
                countEntre21e30++;
            }
            else {
                sumMaioresDe31+= peso;
                countMaioresDe31++;
            }
        }

        double averageEntre1e10 = sumEntre1e10 / countEntre1e10;
        double averageEntre11e20 = sumEntre11e20 / countEntre11e20;
        double averageEntre21e30 = sumEntre21e30 / countEntre21e30;
        double averageMaioresDe31= sumMaioresDe31 / countMaioresDe31;

        if (!Double.isNaN(averageEntre1e10)) {
            System.out.printf("A média de peso para a faixa etária entre 1 a 10 anos é de %.1f quilos", averageEntre1e10);
        }

        if (!Double.isNaN(averageEntre11e20)){
            System.out.printf("\nA média de peso para a faixa etária entre 11 a 20 anos é de %.1f quilos", averageEntre11e20);
        }

        if (!Double.isNaN(averageEntre21e30)) {
            System.out.printf("\nA média de peso para a faixa etária entre 21 a 30 anos é de %.1f quilos", averageEntre21e30);
        }

        if (!Double.isNaN(averageMaioresDe31)) {
            System.out.printf("\nA média de peso para maiores de 31 anos é de %.1f quilos", averageMaioresDe31);
        }

        sc.close();
    }
}
