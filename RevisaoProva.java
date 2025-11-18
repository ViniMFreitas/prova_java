import java.util.Scanner;

public class RevisaoProva {

    // --- ESCOPO GLOBAL (STATIC) ---
    // Definimos aqui para que todos os métodos (main, cadastrar, relatorio) possam ver.
    // Fonte: Métodos, Slide 39
    static String[] nomes = new String[3];      // Vetor (Array 1D) para nomes
    static double[][] notas = new double[3][2]; // Matriz (Array 2D) para notas [3 alunos][2 notas]
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        // --- ESTRUTURA DE REPETIÇÃO: DO-WHILE ---
        // Garante que o menu apareça pelo menos uma vez.
        // Fonte: Repetição, Slide 21
        do {
            System.out.println("\n=== SISTEMA DE NOTAS ===");
            System.out.println("1 - Cadastrar Alunos e Notas");
            System.out.println("2 - Mostrar Relatório");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            // --- ESTRUTURA DE SELEÇÃO: SWITCH-CASE ---
            // Ideal para menus ou verificar valores exatos.
            // Fonte: Seleção Múltipla, Slide 2
            switch (opcao) {
                case 1:
                    cadastrarAlunos(); // Chamada de método (Procedimento)
                    break;
                case 2:
                    mostrarRelatorio(); // Chamada de método (Procedimento)
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3); // Teste lógico no final
    }

    // --- MÉTODO SEM RETORNO (VOID) ---
    // Fonte: Métodos, Slide 6
    public static void cadastrarAlunos() {
        System.out.println("\n--- Cadastro ---");

        // Percorrendo o VETOR de nomes (Array Unidimensional)
        // Fonte: Array Unidimensional, Slide 28
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Aluno " + (i + 1) + ":");

            // Limpeza de buffer do teclado (essencial ao usar nextInt seguido de nextLine)
            entrada.nextLine();

            System.out.print("Digite o Nome: ");
            // --- MANIPULAÇÃO DE STRING ---
            // Lê o nome e já converte para CAIXA ALTA.
            // Fonte: Manipulação de Texto, Slide 10
            nomes[i] = entrada.nextLine().toUpperCase();

            System.out.print("Nota 1: ");
            // --- MATRIZ (ARRAY BIDIMENSIONAL) ---
            // Armazenando na linha 'i', coluna 0
            // Fonte: Array Bidimensional, Slide 9
            notas[i][0] = entrada.nextDouble();

            System.out.print("Nota 2: ");
            // Armazenando na linha 'i', coluna 1
            notas[i][1] = entrada.nextDouble();
        }
    }

    public static void mostrarRelatorio() {
        System.out.println("\n--- Relatório Final ---");

        for (int i = 0; i < nomes.length; i++) {
            // Acessando os dados da Matriz para cálculo
            double media = (notas[i][0] + notas[i][1]) / 2;

            // --- OPERADOR TERNÁRIO ---
            // (condição) ? valor_se_verdadeiro : valor_se_falso
            // Fonte: Seleção Múltipla, Slide 10
            String status = (media >= 6.0) ? "APROVADO" : "REPROVADO";

            // Impressão formatada
            System.out.println("Aluno: " + nomes[i] + " | Média: " + media + " | Status: " + status);
        }
    }
}