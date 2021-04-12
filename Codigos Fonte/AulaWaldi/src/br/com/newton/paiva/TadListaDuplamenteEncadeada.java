package br.com.newton.paiva;

public class TadListaDuplamenteEncadeada {
		  TadCelulaDuplamenteEncadeada primeiro;
		  TadCelulaDuplamenteEncadeada ultimo;
		  int tamanho;
		  int capacidade;

		  // construtor
		  public TadListaDuplamenteEncadeada(int capacidade) {
		    TadCelulaDuplamenteEncadeada cabeca = new TadCelulaDuplamenteEncadeada();
		    this.primeiro = cabeca;
		    this.ultimo = cabeca;
		    this.tamanho = 0;
		    this.capacidade = capacidade;
		  }

		  // true se for igual, false o contr�rio
		  public boolean estahCheia() {
		    return (tamanho == capacidade);
		  }

		  public boolean inserir(int chave) {
		    if (estahCheia()) {
		      System.out.println("Lista est� cheia!");
		      return false;
		    }

		    TadCelulaDuplamenteEncadeada nova = new TadCelulaDuplamenteEncadeada();
		    ultimo.prox = nova;
		    nova.ant = ultimo;
		    ultimo = nova;
		    nova.valor = chave;
		    tamanho++;

		    return true;
		  }

		  public void exibir() {
		    System.out.println("\nTAD Lista Duplamente Encadeada");
		    System.out.println("Tamanho: " + tamanho);
		    System.out.println("Capacidade: "+ capacidade);

		    TadCelulaDuplamenteEncadeada aux = primeiro.prox;
		    while (aux != null) {
		      System.out.print(" [ " + aux.valor + " ] <-> ");
		      aux = aux.prox;
		    }
		    System.out.println("NULL");
		  }

		  public boolean pesquisar(int chave) {
		    TadCelulaDuplamenteEncadeada aux = primeiro.prox;
		    // enquanto eu n�o chegar no final E o valor na celula for
		    // diferente do valor de pesquisa
		    while (aux != null && aux.valor != chave) {
		      aux = aux.prox;
		    }

		    if (aux == null) {
		      return false; // 1a condi��o, n�o achou
		    } else {
		      return true; // 2a condi��o, achou
		    }

		  }

		  public void exibirInvertido() {

		  }

		  public boolean retirar(int chave) {
		    return false;
		  }

		  public void inverter() {

		  }

		  public boolean inserirOrdenado(int chave) {
		    return false;
		  }

		  public void inserirVarios(int [] chaves) {

		  }

		}

