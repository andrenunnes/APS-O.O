
public class main {

	public static void main(String[] args) {
		
		Conta andre = new Conta();
		
		
		System.out.println("Seu saldo é de: " + andre.getSaldo());
		
		andre.depositaValor(200);
		
		System.out.println("Seu saldo agora é: " + andre.getSaldo());
		
		System.out.println("Seu novo saldo agora é: " + andre.sacarValor(100));
		
		System.out.println("\n");
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("\n");
		
		ContaEspecial joao = new ContaEspecial();

		System.out.println("Seu saldo especial é de: " + joao.getSaldo());
		
		joao.depositaValor(200);
		
		System.out.println("Seu saldo especial agora é: " + joao.getSaldo());
		
		System.out.println("Seu novo saldo especial agora é: " + joao.sacarValor(100));
	}

}
