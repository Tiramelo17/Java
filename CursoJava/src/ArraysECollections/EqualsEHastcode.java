package ArraysECollections;

public class EqualsEHastcode {
	public static void main(String[] args) {
		
		Usu�rios U1 = new Usu�rios();
		U1.nome = "Melo";
		U1.email="Tirameloboy17@gmail.com";
		Usu�rios U2 = new Usu�rios();
		U2.nome = "Melo";
		U2.email="Tirameloboy17@gmail.com";
		Usu�rios U3 = new Usu�rios();
		U3.nome = "Melo";
		U3.email="Tirameloboy17@gmail.com";
		
		System.out.println(U2.equals(U1));
		System.out.println(U2.equals(U3));
	}
}
