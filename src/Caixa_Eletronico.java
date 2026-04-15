
public class Caixa_Eletronico {
	
	public static void main(String[] args) {
		
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular="João";
		minhaConta.saldo=100.00;
		
		String saldoFormatado = String.format("%.2f", minhaConta.saldo);
		System.out.println(minhaConta.titular + "\n" + "R$" + saldoFormatado);
		
	}

}
