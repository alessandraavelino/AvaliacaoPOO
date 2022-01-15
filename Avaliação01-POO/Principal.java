//scripts referente a questão 1 e 2

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Quadrado q = new Quadrado();
            Retangulo r = new Retangulo();

            System.out.println("Escolha uma opção: " +
                    "\n1 - Quadrado" +
                    "\n2 - Retângulo");
            int menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    q.construtor();
                    q.imprimir();
                    break;
                case 2:
                    r.construtor();
                    r.imprimir();
                    
                default:
                    System.out.println("Opção inexistente");
                break;
            }
        }
    }
}
