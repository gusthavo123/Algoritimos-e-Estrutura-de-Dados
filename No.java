package Arvoresex;

public class No<T> {

	private No<T> primeiro;
	private No<T> ultimo;
	private No<T> atual;
	
	public No<T> getatual (){
		return ultimo;
	}
	
	public No<T> setatual (){
		return atual;
	}
	

	public No<T> getProximo() {
		return atual;
	}
	
	public No<T> getUltimo() {
		return ultimo;
	}

	public void setUltimo(No<T> ultimo) {
		this.ultimo = ultimo;
	}


	void setProximo(No<T> novoNo) {
	}

	private void setConteudo(Object object) {
	}

	void setAnterior(Object object) {
	}

	public No() {
	}
	
	public No(Object object, T conteudo, Object object2) {
	}

	public No<T> getAnterior() {
		return null;
	}

	public No<T> getConteudo() {
		return ultimo;
	}
	

	public void adicionaFinal(T conteudo, int tamanho) {
		No<T> primeiro = null;
		if (tamanho == 0) {
			No<T> novoNo = new No<T>(null, conteudo, null);
			primeiro = novoNo;
		} else {
			No<T> atual = primeiro;
			setUltimo(primeiro);
			while (atual.getProximo() != null) {
				atual = extracted(atual);
			}
			No<T> novoNo = new No<T>(atual, conteudo, null);
			atual.setProximo(novoNo);
		}
		tamanho++;
	}

	private No<T> extracted(No<T> atual) {
		No<T> proximo2 = (No<T>) atual.getProximo();
		No<T> proximo = proximo2;
		No<T> no = proximo;
		return no;
	}

	public void removeInicio() {
		primeiro = null;
		No<T> proximo = extracted();
		No<T> atual = proximo;
		primeiro.setProximo(null);
		primeiro.setConteudo(null);
		atual.setAnterior(null);
		primeiro = atual;
	}

	private No<T> extracted() {
		No<T> proximo = (No<T>) primeiro.getProximo();
		return proximo;
	}

	public void removeFinal() {
		int tamanho = 0;
		No<T> primeiro = null;
		if (tamanho == 0) {
			System.out.println("Não é possível remover um elemento que não existe");
		} else if (tamanho == 1) {
			primeiro.setConteudo(null);
			primeiro.setProximo(null);
		} else {
			No<T> atual = primeiro;
			while (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
			No<T> novoUltimo = atual.getAnterior();
			atual.setAnterior(null);
			atual.setConteudo(null);
			novoUltimo.setProximo(null);
		}
	}

	public void mostraNos(int opcao) {
		int tamanho = 0;
		No<T> primeiro = null;
		if (opcao == 0) {
			if (tamanho != 0) {
				No<T> atual = primeiro;
				int contador = 0;
				while (atual.getProximo() != null) {
					System.out
							.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
					No<T> proximo = (No<T>) atual.getProximo();
					atual = proximo;
					contador++;
				}
				System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
			} else {
				System.out.println("Não existe nenhum elemento na lista.");
			}
		} else if (opcao == 1) {
			if (tamanho != 0) {
				No<T> atual = primeiro;
				int contador = 0;
				while (atual.getProximo() != null) {
					atual = (No<T>) atual.getProximo();
					contador++;
				}
				while (atual.getAnterior() != null) {
					System.out
							.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
					atual = atual.getAnterior();
					contador--;
				}
				System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
			} else {
				System.out.println("Não existe nenhum elemento nessa lista");
			}
		}
	}


}