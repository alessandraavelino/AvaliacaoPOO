public class Caminhao extends Automovel {
    private double comprimento;
    private int cargaTotal;

    public Caminhao(int velocidade, String descricao, int ano, String placa, int cargaTotal, int valor, double comprimento){
        super(velocidade, descricao, ano, placa, valor);
        this.comprimento = comprimento;
        this.cargaTotal = cargaTotal;


    }
    public double getComprimento(){
        return cargaTotal;
    }
    
       public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    public double getCargaTotal(){
        return comprimento;
    }
    
      public void setCargaTotal(int cargaTotal){
        this.cargaTotal = cargaTotal;
    }
    public void ligar(){
        System.out.println("CAMINHÃO LIGADO");
    }

    public void acelerar(){ 
        setVelocidade(getVelocidade() + 8);
    }
    
    public void frear(){
        if (getVelocidade() > 0){
           setVelocidade(getVelocidade() - 8);
        }
        
    }

    
}
