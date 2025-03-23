class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListaEncadeada {
    Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void remove(int data) {
        if (head == null) return;  // Lista vazia, nada para remover

        // Se o nó a ser removido está no começo
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        // Nó não encontrado
        if (current.next == null) return;

        // Remove o nó
        current.next = current.next.next;
    }
}

public class Main {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();

        list.append(10);
        list.append(20);
        list.append(30);

        System.out.println("Lista encadeada:");
        list.printList();

        list.remove(20);  // Remove o valor 20 da lista
        System.out.println("Lista após remover o 20:");
        list.printList();
    }
}

//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[][] original = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//                {10, 11, 12}
//        };
//
//        int linhaParaRemover = 2;  // Remover a terceira linha (índice 2)
//
//        int[][] novaMatriz = new int[original.length - 1][original[0].length];
//
//        // Copiando as linhas que ficam antes da linha a ser removida
//        for (int i = 0; i < linhaParaRemover; i++) {
//            System.arraycopy(original[i], 0, novaMatriz[i], 0, original[i].length);
//        }
//        System.out.println("Nova matriz (parcial): " + Arrays.deepToString(novaMatriz));
//
//        // Copiando as linhas que ficam depois da linha a ser removida
//        for (int i = linhaParaRemover + 1; i < original.length; i++) {
//            System.arraycopy(original[i], 0, novaMatriz[i - 1], 0, original[i].length);
//        }
//        System.out.println("Nova matriz (final): " + Arrays.deepToString(novaMatriz));
//    }
//}

//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[][] matrizOriginal = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//        System.out.println("Matriz original: " + Arrays.deepToString(matrizOriginal));
//
//        // Adicionando uma nova linha
//        int[][] matrizComLinhaAdicional = new int[matrizOriginal.length + 1][matrizOriginal[0].length];
//        for (int i = 0; i < matrizOriginal.length; i++) {
//            for (int j = 0; j < matrizOriginal[i].length; j++) {
//                matrizComLinhaAdicional[i][j] = matrizOriginal[i][j];
//            }
//        }
//        // Inicializando a nova linha com valores (por exemplo, 0)
//        for (int j = 0; j < matrizComLinhaAdicional[0].length; j++) {
//            matrizComLinhaAdicional[matrizComLinhaAdicional.length - 1][j] = 0;
//        }
//        System.out.println("Matriz com +1 linha: " + Arrays.deepToString(matrizComLinhaAdicional));
//
//        // Adicionando uma nova coluna
//        int[][] matrizComColunaAdicional = new int[matrizOriginal.length][matrizOriginal[0].length + 1];
//        for (int i = 0; i < matrizOriginal.length; i++) {
//            for (int j = 0; j < matrizOriginal[i].length; j++) {
//                matrizComColunaAdicional[i][j] = matrizOriginal[i][j];
//            }
//            // Inicializando a nova coluna com valores (por exemplo, 0)
//            matrizComColunaAdicional[i][matrizComColunaAdicional[i].length - 1] = 0;
//        }
//        System.out.println("Matriz com +1 coluna: " + Arrays.deepToString(matrizComColunaAdicional));
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // primeira forma
//        int[][] minhaMatriz;
//        minhaMatriz = new int[2][3];
//
//        minhaMatriz[0][0] = 1;
//        minhaMatriz[0][1] = 2;
//        minhaMatriz[0][2] = 3;
//        minhaMatriz[1][0] = 4;
//        minhaMatriz[1][1] = 5;
//        minhaMatriz[1][2] = 6;
//
//        // segunda forma
//        int[][] outraMatriz = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//
//        // outros tipos (exemplo: String)
//        String[][] nomes = {
//                {"Ana", "Beto"},
//                {"Carlos", "Diana"},
//                {"Eduardo", "Fernanda"}
//        };
//    }
//}

//public class Main {
//    public static int buscaBinaria(int[] array, int x) {
//        int esquerda = 0;
//        int direita = array.length - 1;
//        int contador = 1;
//
//        while (esquerda <= direita) {
//            int meio = (esquerda + direita) / 2;
//
//            System.out.print("Tentativa " + contador + ". ");
//            System.out.print("Vendo se " + x + " fica antes/depois/é igual a " + array[meio] + ". ");
//            contador++;
//
//            if (array[meio] == x) {
//                System.out.println("Achei!");
//                return meio; // elemento encontrado na posição 'meio'
//            } else if (array[meio] < x) {
//                System.out.println("Fica depois.");
//                esquerda = meio + 1; // procurar na metade à direita
//            } else {
//                System.out.println("Fica antes.");
//                direita = meio - 1; // procurar na metade à esquerda
//            }
//        }
//
//        return -1; // elemento não encontrado
//    }
//
//    public static void main(String[] args) {
//        int[] vetor = {1, 3, 5, 7, 9, 10, 11, 13, 14, 15, 17, 19, 20, 22, 200};
//        int item_para_encontrar = 11;
//
//        int resultado = buscaBinaria(vetor, item_para_encontrar);
//
//        if (resultado == -1) {
//            System.out.println("Elemento não encontrado.");
//        } else {
//            System.out.println("Elemento encontrado na posição: " + resultado);
//        }
//    }
//}

//public class Main {
//    public static int buscaLinear(int[] array, int x) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Procurando... Tentativa " + (i + 1) + " de " + array.length);
//            if (array[i] == x) {
//                return i; // elemento encontrado na posição 'i'
//            }
//        }
//        return -1; // elemento não encontrado
//    }
//
//    public static void main(String[] args) {
//        int[] vetor = {4, 2, 7, 9, 11, 15, 5, 8, 3, 6};
//        int item_para_encontrar = 5;
//
//        int resultado = buscaLinear(vetor, item_para_encontrar);
//
//        if (resultado == -1) {
//            System.out.println("Elemento não encontrado.");
//        } else {
//            System.out.println("Elemento encontrado na posição: " + resultado);
//        }
//    }
//}