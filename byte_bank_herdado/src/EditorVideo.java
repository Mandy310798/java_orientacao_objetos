
// Gerente herda da classe Funcion�rio
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		return super.getBonificacao() + 100; 
	}
	
}