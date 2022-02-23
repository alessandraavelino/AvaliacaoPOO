public abstract class Frete implements Fretavel{
    private String nome;
    private double distancia;
    private double valorPorKm;

    public Frete(String nome, double distancia, double valorPorKm){
        this.distancia = distancia;
        this.valorPorKm = valorPorKm;
        this.nome = nome;

    }

    public double getDistancia(){
        return distancia;
    }

    public double getValorPorKm(){
        return valorPorKm;
    }

    public String toString(){
        return "Nome: " + nome + " / Distancia: " + distancia + "Valor Por Km: " + valorPorKm; 
    }


    
}