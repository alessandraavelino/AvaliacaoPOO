package com.poo.exercito;

public class CadastroMilitar {
    private final Militar[] militares;
    private int indice;

    public CadastroMilitar(int tamanho) {
        militares = new Militar[tamanho];
        indice = 0;
    }

    public void adicionarMilitar(Militar m) {
        if (indice < militares.length) {
            militares[indice] = m;
            indice++;
        }
    }

    public void imprimirPodeProgredir(){
        for (Carreira militar : militares){
            if(militar.podeProgredir() == true){
                System.out.println(militar);

            }

        }
    }
    public void realizarProgressao(){

    }




}
