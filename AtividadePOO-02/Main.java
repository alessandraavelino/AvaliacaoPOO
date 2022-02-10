public class Main {
    public static void main(String[] args) {
               //veloc inicial  , nome , ano , placa , valor , comprimento , passageiros
        Automovel onibus = new Onibus(0, "Onibus Big", 2022, "A321FD", 98000, 10, 54);
        onibus.ligar();
        onibus.acelerar();
        onibus.frear();

        Automovel carro = new Carro(0, "F5645", "BMW Car", 2022, 1000, 4, 250000);
        carro.ligar();
        carro.acelerar();
        carro.frear();
        
        Automovel moto = new Moto(0, "Moto Honda", 2022, "FD45646", 10000, 4851);
        moto.ligar();
        moto.acelerar();
        moto.frear();

        Automovel caminhao = new Caminhao(0, "Big bus", 2022, "HG46456", 70000, 180000, 5.5);
        caminhao.ligar();
        caminhao.acelerar();
        caminhao.frear();

        System.out.println(onibus);
        System.out.println(carro);
        System.out.println(moto);
        System.out.println(caminhao);

    }

    
    
}
