
public class RepositorioAlunosArray {
	private Aluno[] alunos;
	private int indice;
	private final static int MAX = 2;
	
	public RepositorioAlunosArray(){
		indice = 0;
		alunos = new Aluno[MAX];
	}
	
	public void inserir(Aluno a){
		alunos[indice] = a;
		indice++;
	}

}
