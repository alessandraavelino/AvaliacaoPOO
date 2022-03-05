package com.poo.exercito;

public class MilitarExercito extends Militar {
    private boolean participouGuerra;
    private boolean ganhouGuerra;


    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean ganhouGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.ganhouGuerra = ganhouGuerra;
    }

    @Override
    public void imprimePodeProgredir() {

    }

    @Override
    public int getMatricula() {
        return super.getMatricula();
    }

    public String getPatente() {
        return super.patente();
    }

    public boolean podeProgredir() {
        if (getParticipouGuerra() == true && getGanhouGuerra() == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getGanhouGuerra() {
        return ganhouGuerra;
    }

    private boolean getParticipouGuerra() {
        return participouGuerra;
    }

    public String toString(){
        return "Matrícula: " + getMatricula() + " , Patente: " + getPatente() + " , País ganhou 1 guerra: " + ganhouGuerra + " , Participo de 1 Guerra: " + participouGuerra + " , Pode progredir: " + podeProgredir();
    }


}
