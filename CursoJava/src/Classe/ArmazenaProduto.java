package Classe;

import java.util.ArrayList;

public class ArmazenaProduto {

	
	int tamanho=0;	
	int pos;

	ArrayList<Produto> Lista = new ArrayList<>();
	public void Iniciar() {
	 int tamanho=0;	
	 int pos;
	}


		public void Inserir(Produto P) {
			Lista.add(P);
			tamanho++;
			pos++;
		}
		public void exi() {
			
			for(Produto P : Lista) {
				System.out.println("------------------------------");
				System.out.println("Id: "+(P.numPro));
				System.out.println("Produto: "+P.Nome);
				System.out.println("Pre�o original: "+P.Preco);
				System.out.printf("Pre�o p�s desconto: %.2f",P.PrecoD);
				System.out.println("------------------------------");
			}
		}
		
		
	 
}
