import java.util.concurrent.SynchronousQueue;


public class TestaALuno {

	public static void main(String[] args) {
		Curso novoCurso = new Curso(123, "BSI");
		Curso novoCurso2 = new Curso(567, "ADM");
		Aluno novoAluno = new Aluno("Crescencio", 456, 18, novoCurso);
		Aluno novoAluno2 = new Aluno("Joao", 786, 21, novoCurso);
		RepositorioAlunosArray bd = new RepositorioAlunosArray();
		bd.inserir(novoAluno);
		bd.inserir(novoAluno2);
		
		Curso [] teste = {novoCurso, novoCurso2};
		System.out.println(teste[1]);
		System.out.println(teste[0].getCodigo());

	}

}
