package bytebank;

public class CriarClientes {
	public static void main(String[] args) {
		Cliente cliente01 = new Cliente();
		Cliente cliente02 = new Cliente();
		
		cliente01.setNome("Felipe");
		cliente02.setNome("Thuany");
		cliente01.setCpf("333.333.333-33");
		cliente02.setCpf("111.111.111-11");
		cliente01.setProfissao("Dev");
		cliente02.setProfissao("Psicologa");
		
		
		}

}
