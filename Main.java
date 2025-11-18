import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String dnaPai, dnaFilho;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sequencia de dna do pai (A, C, G, T) --> ");
        dnaPai = sc.next();

        System.out.println("Digite a sequencia de dna do filho (A, C, G, T) --> ");
        dnaFilho = sc.next();

        dnaPai = dnaPai.toLowerCase();
        dnaFilho = dnaFilho.toLowerCase();
    }

    public static boolean ValidarConteudo(String sequencia) {
        char[] caracteres = sequencia.toCharArray();

        for (char c : caracteres) {
            if (c != 'a' && c != 'c' && c != 'g' && c != 't') {
                return false;
            }
        }
        return true;
    }
}