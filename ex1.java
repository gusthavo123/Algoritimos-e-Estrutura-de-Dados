package Arvoresex;

public class ex1 {
	public int tamanho;
	private int[] valores;
	private int quantidade;

	public ex1() {
		System.out.println("Construtor vazio");
	}

	public ex1(int tamanho) {
		System.out.println("Construtor com parametro");
		this.tamanho = tamanho;
		this.valores = new int[this.tamanho];
	}

	public int add(int valor) {
		if (tamanho < quantidade) {
			System.out.println("O valor: " + valor + " foi adicionado!");
			return valor;
		}
		if (tamanho == quantidade) {
			System.out.println("Nao foi possivel adicionar!");
		}
		return valor;
		
	}

	public int remover(int posicao) {
		int aux;
		if (posicao >= 0 && posicao < valores.length) {
			aux = valores[posicao];
			valores[posicao] = 0;
			System.out.println("O valor de: " + aux + " foi removido!");
			return aux;
		} else {
			System.out.println("Nao foi possivel remover!");
			return -1;
		}
	}

	public void mostrar() {
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Metodo interno da classe simples!");
		}
	}

	public boolean estaVazia() {
		if (this.tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}
}