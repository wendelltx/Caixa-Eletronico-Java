
public class Caixa_Eletronico {
	
	public static void main(String[] args) {
		
		Conta minhaConta;
		minhaConta = new Conta();
		
		minhaConta.titular="João";
		minhaConta.saldo=100.00;
		System.out.println(minhaConta.titular + "\n" + minhaConta.saldo);
		
	}

}
