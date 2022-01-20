package com.letscode.validators.aluno;

public class Aluno {
    public Aluno(double mediaDeNotas, int numeroDeFaltas) {
        this.mediaDeNotas = mediaDeNotas;
        this.numeroDeFaltas = numeroDeFaltas;
    }

    double mediaDeNotas;
    int numeroDeFaltas;

    public double getMediaDeNotas() {
        return mediaDeNotas;
    }

    public void setMediaDeNotas(double mediaDeNotas) {
        this.mediaDeNotas = mediaDeNotas;
    }

    public int getNumeroDeFaltas() {
        return numeroDeFaltas;
    }

    public void setNumeroDeFaltas(int numeroDeFaltas) {
        this.numeroDeFaltas = numeroDeFaltas;
    }
}
