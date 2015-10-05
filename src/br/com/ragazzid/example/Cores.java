package br.com.ragazzid.example;

public enum Cores {
	VERMELHO(255,0,0),
	AZUL(0,0,255),
	VERDE(0,128,128),
	LARANJA(128,128,0);
	
	private int vermelho;
	private int azul;
	private int verde;
	private int laranja;
	
	private Cores (int r, int g, int b){
		vermelho = r;
		azul = b;
		verde = g;
		
	}
	
	public String valores(){
		return String.format("%d %d %d", vermelho, verde, azul);
	}
	
	@Override
	public String toString(){
		String value = super.toString();
		return value.substring(0, 1) + value.substring(1).toLowerCase();
	}
}
