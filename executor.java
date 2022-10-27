package Arvoresex;

public class executor {
	public static void main(String[] args) {

		ListaLigada listaLigada = new ListaLigada();
		System.out.println(listaLigada.getTamanho());

		// Inserindo um elemento na lista ligada
		listaLigada.adicionaInicio(10);
		listaLigada.adicionaFinal(11);
		listaLigada.adicionaFinal(12);
		listaLigada.adicionaFinal(14);		
		listaLigada.adicionaFinal(15);
		System.out.println(listaLigada.getTamanho());

		// Verificando elementos da lista ligada
		listaLigada.mostraNos();
	}
}
