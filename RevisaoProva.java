import java.util.Scanner;

public class RevisaoProva {

    // Variáveis Globais (Acessíveis por todos os métodos)
    static String[] nomes = new String[3]; // Vetor para nomes
    static double[][] notas = new double[3][2]; // Matriz 3x2 para notas
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        // Menu usando do-while para garantir execução pelo menos uma vez [cite: 943]
        do {
            System.out.println("\n1 - Cadastrar Alunos e Notas");
            System.out.println("2 - Mostrar Relatório");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            // Seleção Múltipla [cite: 2947]
            switch (opcao) {
                case 1:
                    cadastrarAlunos(); // Chamada de método [cite: 1464]
                    break;
                case 2:
                    mostrarRelatorio();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);
    }

    // TODO: Complete este método
    public static void cadastrarAlunos() {
        System.out.println("--- Cadastro ---");
        // DICA: Use um loop 'for' que vá de 0 até nomes.length [cite: 3427]
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":");

            // 1. Limpe o buffer do teclado (necessário ao alternar nextInt e nextLine)
            entrada.nextLine();

            // 2. Leia o nome e armazene no vetor 'nomes' JÁ CONVERTIDO para Maiúsculas
            // SEU CÓDIGO AQUI: nomes[i] = ...

            System.out.print("Nota 1: ");
            // 3. Leia a primeira nota e guarde na matriz 'notas', linha 'i', coluna 0
            // SEU CÓDIGO AQUI:

            System.out.print("Nota 2: ");
            // 4. Leia a segunda nota e guarde na matriz 'notas', linha 'i', coluna 1
            // SEU CÓDIGO AQUI:
        }
    }

    // TODO: Complete este método
    public static void mostrarRelatorio() {
        System.out.println("--- Relatório ---");
        // DICA: Percorra os vetores novamente
        for (int i = 0; i < nomes.length; i++) {
            // 1. Calcule a média recuperando os dados da matriz
            double media = (notas[i][0] + notas[i][1]) / 2;

            // 2. Use o Operador Ternário para definir "Aprovado" ou "Reprovado" (corte 6.0) [cite: 3097]
            String status = (media >= 6.0) ? "Aprovado" : "Reprovado";

            System.out.println("Aluno: " + nomes[i] + " | Média: " + media + " | Status: " + status);
        }
    }
}