public class Main {
    public static void main(String[] args) {

        CadastroFrete fretes = new CadastroFrete(3);

        Frete fretePadrao = new FretePadrao("Frete Padrão", 6, 8);
        Frete freteExpresso = new FreteExpresso("Frete Expresso", 7, 2, 21);
        Frete freteSuperExpresso = new FreteSuperExpresso("Frete Super Expresso", 5, 6, 8, 54);
        
        fretes.adicionarFrete(fretePadrao);
        fretes.adicionarFrete(freteExpresso);
        fretes.adicionarFrete(freteSuperExpresso);

        fretes.imprimirFretes();

      //System.out.println("Total: " + fretes.calcularTotal());
        System.out.println("Frete padrão: " + fretePadrao.calcularFrete());
        System.out.println("Frete Expresso: " + freteExpresso.calcularFrete());
        System.out.println("Frete SuperExpresso: " + freteSuperExpresso.calcularFrete());

        //não entendi muito bem se o Sr quis dizer se o total é de 'cada frete' ou de 'todos eles'

        
    }
    
}
