public class Main {

    public static void main(String[] args) {
        int[] vetor = {1, 5, 2, 3, 1, 3, 1};
        int moda = 0;
        int soma = 0;
        int maior = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] == vetor[j]) {
                    soma++;
                }
            }
            if (soma >= maior) {
                maior = soma;
                moda = vetor[i];
            }
        }
        System.out.println("Moda: " + moda);
    }
}
