package bytebank;
import java.util.Scanner;

public class TestaMetodos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int resp =9;
		Conta conta01 = new Conta();
		Conta conta02 = new Conta();
		int conta =0;
		
		System.out.println("Selecione a conta que deseja realizar operacoes:");
		System.out.println("1-Conta01");
		System.out.println("2-Conta02");
		conta = input.nextInt();
		
		if(conta == 1) {
			while(resp != 0) {
				System.out.println("Voce esta na conta01!");
				System.out.println("Informe a operacao desejada");
				System.out.println("1-Saldo");
				System.out.println("2-Deposito");
				System.out.println("3-Saque");
				System.out.println("4-Transferencia");
				System.out.println("0-Sair");
				resp = input.nextInt();
				if(resp == 1) {
					System.out.println("Saldo atual - R$"+conta01.saldo);
					System.out.println("");
				}else if (resp == 2) {
					System.out.print("Informe o valor do deposito: ");
					conta01.deposita(input.nextDouble());
					
					System.out.println("Deposito efetuado com sucesso.");
					System.out.println("");
				}else if(resp == 3) {
					System.out.print("Informe quanto deseja sacar: ");
					conta01.saca(input.nextDouble());
					System.out.println("");

				}else if(resp ==4) {
					System.out.print("Informe o valor a ser transferido para a conta02: ");
					conta01.transfere(input.nextDouble(), conta02);
					System.out.println("");
					
				}else if(resp==0) {
					break;
					
				}else {
					System.out.println("Opcao invalida");
				}
			
		}
		}
		else if (conta == 2) {
			while(resp != 0) {
				System.out.println("Voce esta na conta02!");
				System.out.println("Informe a operacao desejada");
				System.out.println("1-Saldo");
				System.out.println("2-Deposito");
				System.out.println("3-Saque");
				System.out.println("4-Transferencia");
				System.out.println("0-Sair");
				resp = input.nextInt();
				if(resp == 1) {
					System.out.println("Saldo atual - R$"+conta02.saldo);
					System.out.println("");
				}else if (resp == 2) {
					System.out.print("Informe o valor do deposito: ");
					conta02.deposita(input.nextDouble());
					
					System.out.println("Deposito efetuado com sucesso.");
					System.out.println("");
				}else if(resp == 3) {
					System.out.print("Informe quanto deseja sacar: ");
					conta02.saca(input.nextDouble());
					System.out.println("");

				}else if(resp ==4) {
					System.out.print("Informe o valor a ser transferido para a conta02: ");
					conta02.transfere(input.nextDouble(), conta01);
					System.out.println("");
					
				}else if(resp==0) {
					break;
					
				}else {
					System.out.println("Opcao invalida");
				}
			
		}
		}
					
		}
					
}

