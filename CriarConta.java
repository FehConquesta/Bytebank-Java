package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Saldo primeira conta: "+primeiraConta.saldo);
		System.out.println("Saldo segunda conta: "+segundaConta.saldo);
		

	}

}