public class Carro extends Automovel {
    private int potencia;
    private int qtdPortas;

    public Carro(int velocidade, String placa, String descricao, int ano, int potencia, int qtdPortas, int valor) {
        super(velocidade, descricao, ano, placa, valor);
        this.potencia = potencia;
        this.qtdPortas = qtdPortas;

    }

    @Override
    public void ligar() {
        System.out.println("CARRO LIGADO");
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int QtdPortas) {
        this.qtdPortas = QtdPortas;
    }

}
