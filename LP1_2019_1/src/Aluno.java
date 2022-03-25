public class Aluno {
	private String nome;
	private int cpf;
	private int idade;
	private Curso CursoAluno;
	
	public Aluno(String nom, int cp, int idad, Curso CursoAlun){
		this.nome = nom;
		this.cpf = cp;
		this.idade = idad;
		this.CursoAluno = CursoAlun;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Curso getCursoAluno(){
		return this.CursoAluno;
	}
	
	public void setCursoAluno(Curso CursoAlun){
		this.CursoAluno = CursoAlun;
	}
	
}
