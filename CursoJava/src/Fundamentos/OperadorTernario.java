package Fundamentos;
import java.util.*;
public class OperadorTernario {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			Scanner L =new Scanner(System.in);
			System.out.println("Digite a m�dia: ");	
			double media = L.nextDouble();
			String Fudido = media < 5.0 ? "Aluno est� fudido" : "Aluno est� de recupera��o";
			String resultado = media>=7.0 ? "O aluno est� aprovado" : Fudido;
			System.out.println(resultado);
		
		}
}
