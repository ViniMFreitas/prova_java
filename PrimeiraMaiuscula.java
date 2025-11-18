public class PrimeiraMaiuscula {
    public static void main(String[] args) {
        // 1. Vetor com nomes em minúsculo
        String[] nomes = {"ana", "bruno", "carlos"};

        System.out.println("--- Antes ---");
        for (String n : nomes) System.out.println(n);

        // 2. Loop para percorrer o vetor
        for (int i = 0; i < nomes.length; i++) {

            // Passo A: Isola a primeira letra ("a") e joga para MAIÚSCULA ("A")
            // Fonte: Manipulação de Texto, Slide 10 (substring e toUpperCase)
            String primeiraLetra = nomes[i].substring(0, 1).toUpperCase();

            // Passo B: Pega o resto da palavra ("na")
            // Fonte: Manipulação de Texto, Slide 10
            String restoDaPalavra = nomes[i].substring(1);
            // Dica extra: use .toLowerCase() no resto se a prova for chata com formatação

            // Passo C: Concatena e salva de volta na MESMA posição do vetor
            // Fonte: Manipulação de Texto, Slide 11 (Concatenação)
            nomes[i] = primeiraLetra + restoDaPalavra;
        }

        System.out.println("\n--- Depois ---");
        for (String n : nomes) {
            System.out.println(n); // Imprime: Ana, Bruno, Carlos
        }
    }
}