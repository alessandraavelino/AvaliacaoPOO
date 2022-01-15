import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
      try (Scanner entrada = new Scanner(System.in)) {
        int n = 10; // tamanho dos vetores
          int a[] = new int[n]; // declarando os vetores de nros inteiros "a", "b" e "c" de tamanho "n"
          int b[] = new int[n];
          double c[] = new double[n];
          int i; // indice (ou posicao)

          for (i=0; i<n; i++) {
            System.out.printf("Informe o %2do. elemento de %d do vetor 'a': ", (i+1), n);
            a[i] = entrada.nextInt();
          }

          System.out.printf("\n\n");

          for (i=0; i<n; i++) {
            System.out.printf("Informe o %2do. elemento de %d do vetor 'b': ", (i+1), n);
            b[i] = entrada.nextInt();
          }

          for (i=0; i<n; i++) {
            c[i] = a[i] / (float)b[i];
          }

          System.out.printf("\n\ni- a[i]   b[i]   c[i] = a[i] / b[i]\n");
          System.out.printf("===================================\n");
          for (i=0; i<n; i++) {
            System.out.printf("%d- %4d   %4d   %7.2f\n", i, a[i], b[i], c[i]);
          }
    }

      System.out.printf("===================================\n");
    }

}