public class FreteExpresso extends Frete {
    public int nivelUrgencia;

    public FreteExpresso(String nome, double distancia, double valorPorKm, int nivelUrgencia){
        super(nome, distancia, valorPorKm);
        
        this.nivelUrgencia = nivelUrgencia;

    }

    public double calcularFrete(){
        return  (getDistancia() * getValorPorKm()) + (nivelUrgencia * 100);
    }
    
}
