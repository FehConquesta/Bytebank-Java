package bytebank;

public  class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

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
