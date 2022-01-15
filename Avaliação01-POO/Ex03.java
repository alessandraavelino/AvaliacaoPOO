import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
      try (Scanner entrada = new Scanner(System.in)) {
        int n = 15; // tamanho dos vetores
          int a[] = new int[n]; // declarando os vetores de nros inteiros "a" e "b" de tamanho "n"
          int b[] = new int[n];
          int i; // indice (ou posicao)

          for (i=0; i<n; i++) {
            System.out.printf("Informe o %2do. elemento de %d: ", (i+1), n);
            a[i] = entrada.nextInt();
          }

          for (i=0; i<n; i++) {
            b[i] = a[i] * a[i];
          }

          System.out.printf("\n\n i- a[i]   b[i] = a[i] * a[i]\n");
          System.out.printf("******************************\n");
          for (i=0; i<n; i++) {
            System.out.printf("%2d- %4d   %4d\n", i, a[i], b[i]);
          }
    }

      System.out.printf("**************************\n");
    }

}
