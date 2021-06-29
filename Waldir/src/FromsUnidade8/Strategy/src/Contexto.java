
public class Contexto {

	// 4a estratégia via interface
	private Strategy estrategia;
	
	public void setEstrategia(Strategy estrategia) {
		System.out.println("Setando a estratégia: " + estrategia + "\n");
		
		this.estrategia = estrategia;
	}
	
	public int executar(int a, int b) {
        if (estrategia == null) {
			System.out.println("ERRO: estratégia não definida.");
			
			return 0;
		}
		
        else if(this.estrategia.equals(new Divisao()) && b == 0){
            System.out.println("ERRO: Divisão por ZERO não é permitido");
            return 0;
        }
		return estrategia.execute(a, b);
	}
}
