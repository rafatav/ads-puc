import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] vetor = {1, 5, 2, 3, 1, 3, 1};
        int moda = 0;
        int soma = 0;
        int maior = 0;
        int num = 0;

        int[] vetors = Arrays.stream(vetor).sorted().toArray();

        num = vetors[0];
        for (int i = 0; i < vetors.length; i++) {
            if (vetors[i] == num) {
                soma++;
                if (soma >= maior) {
                    maior = soma;
                    moda = vetors[i];
                }
            } else {
                soma = 0;
                num = vetors[i];
            }
        }
        System.out.println("Moda: " + moda);
    }
}
