package com.poo.exercito;

public class MilitarMarinha extends Militar {
    private boolean participouConsertoAviao;

    public MilitarMarinha(int matricula, String patente, boolean participouConsertoAviao) {
        super(matricula, patente);
        this.participouConsertoAviao = participouConsertoAviao;
    }

    public boolean podeProgredir(){
        if (getParticipouConsertoAviao() == true){
            return true;
        } else {
            return false;
        }
    }

    private boolean getParticipouConsertoAviao(){
        return participouConsertoAviao;
    }

    @Override
    public void imprimePodeProgredir() {


    }

    public String toString(){
        return "Matrícula: " + getMatricula() + " , Patente: " + patente() + " , Participou Conserto Avião: " + getParticipouConsertoAviao() + " , Pode Progredir: " + podeProgredir();
    }
}
