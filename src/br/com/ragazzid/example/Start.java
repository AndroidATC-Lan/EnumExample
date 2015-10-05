package br.com.ragazzid.example;

public class Start {

	public static void main(String[] args) {
		Cores cor = Cores.LARANJA;
		System.out.printf("Name: %s\n", cor);
		System.out.printf("Position: %s\n", cor.ordinal());
		System.out.printf("String: %s\n", cor.toString());
		System.out.printf("Valor: %s\n", cor.valores());
		
		System.out.println("------------------------------");
		
		Cores cor2 = Cores.VERMELHO;
		System.out.printf("Name: %s\n", cor2);
		System.out.printf("Position: %s\n", cor2.ordinal());
		System.out.printf("String: %s\n", cor2.toString());
		System.out.printf("Valor: %s\n", cor2.valores());
		

	}

}
