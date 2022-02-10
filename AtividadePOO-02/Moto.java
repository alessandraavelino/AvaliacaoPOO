public class Moto extends Automovel{
    private int potencia;

    public Moto(int velocidade, String descricao, int ano, String placa, int valor, int potencia){
        super(velocidade, descricao, ano, placa, valor);
        this.potencia = potencia;
    }
    
    public void ligar() {
        System.out.println("MOTO LIGADA");
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
}
    
