import com.letscode.validators.aluno.Aluno;
import com.letscode.validators.aluno.ValidadorAluno;

import javax.xml.validation.Validator;

public class Main {
    public static void main(String[] args) {
        Aluno Jorge = new Aluno(7.1, 10);
        Aluno aluno = new Aluno(5.8, 30);
        boolean resultado = ValidadorAluno.verificaAprovacao(aluno);
        System.out.println(resultado);
    }
}
