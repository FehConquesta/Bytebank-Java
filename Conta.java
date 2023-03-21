package bytebank;

public  class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque efetuado com sucesso.");
			return true;
		}
		else {
			System.out.println("Não foi possivel sacar, falta dinheiro");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo>= valor) {
			destino.deposita(valor);
			this.saldo -=valor;
			System.out.println("Transferencia realizada com sucesso.");
			return true;
		}else {
			System.out.println("Nao foi possivel transferir, falta dinheiro");
		}
		
		return false;
	}
	
	

}
