package com.poo.exercito;

public class MilitarAeronautica extends Militar {
    private int anosPatente;
    private int horasVoo;


    public MilitarAeronautica(int matricula, String patente, int anosPatente, int horasVoo){
        super(matricula, patente);
        this.anosPatente = anosPatente;
        this.horasVoo = horasVoo;
    }


    @Override
    public void imprimePodeProgredir() {


    }

    @Override
    public int getMatricula() {
        return super.getMatricula();
    }

    @Override
    public String patente() {
        return super.patente();
    }

    public boolean podeProgredir(){
        if (getAnosPatente() > 2 && getHorasVoo() > 100){
            return true;
        } else {
            return false;
        }
    }
    private int getHorasVoo(){
        return horasVoo;
    }


    private int getAnosPatente() {
        return anosPatente;
    }

    public String toString(){
        return "Matrícula: " + getMatricula() + " , Horas de Vôo: " + horasVoo + " , Anos de Patente: " + anosPatente + " , Pode progredir: " + podeProgredir();
    }



}
