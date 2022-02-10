public class Onibus extends Automovel{
    private int comprimento;
    private int totalPassageiros;

    public Onibus(int velocidade, String descricao, int ano, String placa, int valor, int comprimento, int totalPassageiros) {
      super(velocidade, descricao, ano, placa, valor);
      this.totalPassageiros = totalPassageiros;
      this.comprimento = comprimento;
    }

  
    public void ligar() {
      System.out.println("ÔNIBUS LIGADO");
    }
  
    public void acelerar() {
      setVelocidade(getVelocidade() + 8);
    }

    public int getComprimento() {
        return comprimento;
    }
    
      public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
  
    public void frear() {
      if (getVelocidade() > 0) {
        setVelocidade(getVelocidade() - 8);
      }
  
    }
 
    public int getTotalPassageiros() {
      return totalPassageiros;
    }
  
    public void setTotalPasssageiros(int totalPassageiros) {
      this.totalPassageiros = totalPassageiros;
    }

}