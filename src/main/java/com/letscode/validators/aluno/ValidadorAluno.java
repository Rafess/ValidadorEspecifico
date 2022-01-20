package com.letscode.validators.aluno;

import com.letscode.MotorRegraValidacao;
import com.letscode.RegraValidacao;

public class ValidadorAluno {
    public static boolean verificaAprovacao(Aluno aluno) {
        RegraValidacao<Aluno>[] regras = new RegraValidacao[]{new RegraMediaNotas(), new RegraNumeroFaltas()};
        MotorRegraValidacao<Aluno> novoMotorRegraValidacao = new MotorRegraValidacao<>(regras);
        return novoMotorRegraValidacao.executa(aluno);
    }

}
