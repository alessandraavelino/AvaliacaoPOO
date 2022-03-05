package com.poo.exercito;

public abstract class Militar implements Carreira {
    private int matricula;
    private String patente;

    public Militar(int matricula, String patente){
        this.matricula = matricula;
        this.patente = patente;


    }
    public abstract void imprimePodeProgredir();

    public int getMatricula(){
        return matricula;
    }
    public String patente(){
        return patente;
    }


    public String toString(){
        return "Matrícula: " + matricula + " , Patente: " + patente;
    }


}
