package bytebank;

public class CriarConta {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.deposita(200);
		
		System.out.println(primeiraConta.getSaldo());
		
		Conta segundaConta = new Conta();
		segundaConta.deposita(150);
		
		System.out.println("Saldo primeira conta: "+primeiraConta.getSaldo());
		System.out.println("Saldo segunda conta: "+segundaConta.getSaldo());
		

	}

}
