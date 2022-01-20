package com.letscode.validators.aluno;

import com.letscode.RegraValidacao;

public class RegraNumeroFaltas implements RegraValidacao<Aluno> {
    @Override
    public boolean validar(Aluno aluno) {
        return aluno.getNumeroDeFaltas() < 20;
    }
}
