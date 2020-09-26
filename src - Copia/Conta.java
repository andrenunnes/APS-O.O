
public class Conta {
	protected double saldo;
	
	private static double TAXA = 0.05;
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public double depositaValor(double deposito) {
		return this.saldo = saldo + deposito;
		
	}
	
	public double sacarValor(double valor) {
		return this.saldo = saldo - (valor * TAXA) - valor;
	}
	
}
