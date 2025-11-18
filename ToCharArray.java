public class ToCharArray {
    public static void main(String[] args) {

        // 1. Temos uma String original (Imutável)
        String palavra = "prova";

        // 2. Convertemos para um array de caracteres para poder mexer nela
        // Fonte: Manipulação de Texto, Slide 17
        char[] caracteres = palavra.toCharArray();

        // 3. Exibindo cada letra separadamente (Iteração)
        // Fonte: Manipulação de Texto, Slide 18
        System.out.println("--- Soletrando ---");
        for (char c : caracteres) {
            System.out.println(c);
        }

        // 4. Modificando um caractere específico (Ex: mudar 'p' para 'P')
        // Isso só é possível porque agora é um array, não uma String.
        // Fonte: Manipulação de Texto, Slide 19
        caracteres[0] = 'P';

        // 5. Convertendo de volta para String
        // Fonte: Manipulação de Texto, Slide 19
        String novaPalavra = new String(caracteres);

        System.out.println("\n--- Resultado Final ---");
        System.out.println("Original: " + palavra);      // continua "prova"
        System.out.println("Modificada: " + novaPalavra); // virou "Prova"
    }
}