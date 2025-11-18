import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Exercicio03Folha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r, c;

        System.out.print("Digite o numero de setores --> ");
        r = sc.nextInt();

        System.out.print("Digite a quantidade de meses --> ");
        c = sc.nextInt();

        double[][] matriz = new double[r][c];

        for (int linha = 0; linha < matriz.length; linha++) {
            for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                matriz[r][c] = PreencherMatriz(r,c);
            }
        }

    }

    public static double PreencherMatriz (int r, int c) {
        Scanner sc = new Scanner(System.in);
        double valor;


        System.out.print("Digite o valor do setor " + r + " mês " + c);
        valor = sc.nextDouble();

        return valor;
    }


}
