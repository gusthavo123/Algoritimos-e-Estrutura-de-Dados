package Arvoresex;

import java.util.Arrays;

public class ListaLigada<T> {

	private No<T> primeiro;
	private int tamanho;
	private long[] valores;
	private No<T> proximo;
	public char[] getConteudo;
	private T conteudo;
	
	
	public void mostraNos() {
		return;
	}

	public ListaLigada() {
		primeiro = null;
		tamanho = 0;

	}
	
	private void getAnterior() {
		return;
	}
	
	void getConteudo() {
		return;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void adicionaInicio(int i) {
		No<T> novoNo = new No<T>(null, conteudo, null);
	    if (tamanho == 0) {
	      primeiro = novoNo;
	    } else {
	      novoNo.setProximo(primeiro);
	      novoNo.setAnterior(null);
	      primeiro.setAnterior(novoNo);
	      primeiro = novoNo;
	    }
	    tamanho++;
	  }
	public void adicionaFinal() {
	    if (tamanho == 0) {
	      No<T> novoNo = new No<T>(null, conteudo, null);
	      primeiro = novoNo;
	    } else {
	      No<T> atual = primeiro;
	      while (atual.getProximo() != null) {
	        No<T> proximo3 = (No<T>) atual.getProximo();
			No<T> proximo2 = proximo3;
			atual = proximo2;
	      }
	      No<T> novoNo = new No<T>(atual, conteudo, null);
	      atual.setProximo(novoNo);
	    }
	    tamanho++;
	  }

	public T prox() {
		T crescente = null;
		T prox = crescente;
		System.out.println(Arrays.toString(valores));
		return prox;

	}


	public void mostrarNos() {
		int opcao = 0;
		if (opcao == 0) {
			if (tamanho != 0) {
				No<T> atual = primeiro;
				int cont = 0;
				while (atual.getProximo() != null) {
					System.out.println("O conteúdo do nó na posição " + cont + " é igual a: " + atual.getConteudo());
					No<T> proximo2 = (No<T>) atual.getProximo();
					atual = proximo2;
					cont++;
				}
				System.out.println("O conteúdo do nó na posição " + cont + " é igual a: " + atual.getConteudo());
			} else {
				System.out.println("Nenhum elemento na lista.");
			}
		} else if (opcao == 1) {
			if (tamanho != 0) {
				No<T> atual = primeiro;
				int contador = 0;
				while (atual.getProximo() != null) {
					Object proximo2 = atual.getProximo();
					atual = (No<T>) proximo2;
					contador++;
					System.out.println("contador: " + contador);
					System.out.println("atual: " + atual.getConteudo());
					No<T> ultimo = atual.getAnterior();
					System.out.println("anterior: " + ultimo.getConteudo());
				}
				while (atual.getAnterior() != null) {
					System.out
							.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
					atual = atual.getAnterior();
					contador--;
					System.out.println(contador);
				}
				System.out.println("O conteúdo do nó na posição " + contador + " é igual a: " + atual.getConteudo());
			} else {
				System.out.println("Não existe nenhum elemento nessa lista");
			}
		}
	}

	public No<T> getProximo() {
		return primeiro;
	}

	public void setProximo(No<T> proximo) {
		this.proximo = proximo;
	}

	public void adicionaFinal(int i) {
	}



}
