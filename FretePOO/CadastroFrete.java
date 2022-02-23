public class CadastroFrete {
    private Frete[] fretes;
    private int indice;


    public CadastroFrete(int tam){
        fretes = new Frete[tam];
        indice = 0;
    }

    public void adicionarFrete(Frete a){
        if (indice < fretes.length){
            fretes[indice] = a;
            indice ++;
        }
    }
    public void imprimirFretes(){
        for (Fretavel frete : fretes){
            System.out.println(frete);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < indice; i++){
            total = total + fretes[i].calcularFrete();
        }
        return total;
    }
    
}
