
public class ContaEspecial extends Conta{
	
	private double TAXA_ESPECIAL = 0.01;
	
	public double sacarValor(double valor) {
		return this.saldo = saldo - (valor * TAXA_ESPECIAL) - valor;
	}
	
}
