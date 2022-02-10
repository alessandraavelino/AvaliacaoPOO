public abstract class Automovel {
    private int velocidade;
    private String descricao;
    private int ano;
    private String placa;
    private int valor;


    public Automovel(int velocidade, String descricao, int ano, String placa, int valor) {
        this.velocidade = velocidade;
        this.descricao = descricao;
        this.ano = ano;
        this.placa = placa;
        this.valor = valor;
    }

    public abstract void ligar();

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void acelerar() {
      setVelocidade(getVelocidade() + 10);
    }
  
    public void frear() {
      if (getVelocidade() > 0) {
        setVelocidade(getVelocidade() - 10);
      }
  
    }
  
    public int getValor() {
      return valor;
    }
  
    public void setValor(int valor) {
      this.valor = valor;
    }
  
    public String toString() {
      return "Velocidade: " + velocidade + " Descrição: " + descricao + " Ano: " + ano + " Placa: " + placa + " Valor: " + valor;
    }

}