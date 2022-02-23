public class FretePadrao extends Frete {
    public FretePadrao(String nome, double distancia, double valorPorKm){
        super(nome, distancia, valorPorKm);
    }

    public double calcularFrete(){
        return getDistancia() * getValorPorKm();
    }

    
    
}
