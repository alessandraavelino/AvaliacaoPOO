public class FreteSuperExpresso extends FreteExpresso {
    public double valorDoSeguro;

    public FreteSuperExpresso(String nome, int distancia, double valorPorKm, int nivelUrgencia, double valorDoSeguro){
        super(nome, distancia, valorPorKm, nivelUrgencia);
        this.valorDoSeguro = valorDoSeguro;
    }
    

    public double calcularFrete(){
        return (getDistancia() * getValorPorKm()) + (nivelUrgencia * 100) + valorDoSeguro;
    }

}
