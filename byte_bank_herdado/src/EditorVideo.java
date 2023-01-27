
// Gerente herda da classe Funcionário
public class EditorVideo extends Funcionario{
	
	public double getBonificacao() {
		return super.getBonificacao() + 100; 
	}
	
}