package com.poo.exercito;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CadastroMilitar cm = new CadastroMilitar(3);

        Militar militarAeronautica = new MilitarAeronautica(123, "Soldado", 4, 150);
        Militar militarExercito = new MilitarExercito(321456, "Soldado", true, false);
        Militar militarMarinha = new MilitarMarinha(123456, "Soldado", false);
        cm.adicionarMilitar(militarAeronautica);
        cm.adicionarMilitar(militarExercito);
        cm.adicionarMilitar(militarMarinha);

        System.out.println("**Aptos à progredir**");
        cm.imprimirPodeProgredir();










    }


}
