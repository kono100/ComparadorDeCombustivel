package comparadordecombustivel;

/*
3) Faça um algoritmo que recebe como entrada do usuário o preço da gasolina e do etanol, faça o cálculo e
 retorne se é mais vantajoso abastecer com etanol ou gasolina. Para a regra de cálculo, considere que é mais vantajoso
  abastecer com etanol quando o preço do litro for menor que 70% do valor da gasolina.
 */
import java.util.Scanner;

public class ComparadorDeCombustivel {

    public static void main(String[] arguments) {

        Scanner sc = new Scanner(System.in);

        double alchol, gasolina;

        double result_of;

        System.out.print("Preencha usando virgula(,) inves de ponto\n\n");

        System.out.print("Preco do alchol:R$ ");

        alchol = sc.nextDouble();

        System.out.print("Preco do gasolina:R$ ");

        gasolina = sc.nextDouble();

        result_of = alchol / gasolina;

        if (result_of <= 0.70) {

            System.out.printf("\nCOMPENSA MAIS COLOCAR ALCOOL A:R$ %.2f\n\n", alchol);

        } else {

            System.out.printf("\nCOMPENSA MAIS COLOCAR GASOLINA A:R$ %.2f\n\n", gasolina);
        }

    }

}
