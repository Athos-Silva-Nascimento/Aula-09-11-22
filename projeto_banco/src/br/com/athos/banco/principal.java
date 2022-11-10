package br.com.athos.banco;

public class principal {

	public static void main(String[] args) {
		
		cliente cliente1 = new cliente();
		cliente1.cont = new Conta();
		
		cliente1.nome = "Athos";
		cliente1.CPF = 1234;
		cliente1.cont.num = 9999;
		cliente1.cont.sal = 1299.00;
		
		Conta cont1 = new Conta();
		
		cont1.num = 8888;
		cont1.sal = 999.00;
		
		cliente cliente2 = new cliente();
		
		cliente2.cont = cont1;
		cliente2.nome = "Davi";
		cliente2.CPF = 4321;

	}

}
