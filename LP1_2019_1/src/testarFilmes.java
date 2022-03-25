
public class testarFilmes {

	public static void main(String[] args) {
		Filme vingadores = new Filme("Ultimato", 2019, "Nerd", "Irmãos Russo");
		vingadores.imprimir();
		Conteudo simba = new Conteudo("Rei Leao", 2019);
		simba.setGenero("Animação");
		simba.imprimir();
		Serie GoT = new Serie("Game of Thrones", 2010, "Drakaris", 73);
		GoT.imprimir();

	}

}
