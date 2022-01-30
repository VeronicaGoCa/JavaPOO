package javaClasesGenericas;

public class ClaseGenericaII <K, T, E>{
	private K objetoK;
	private T objetoT;
	private E objetoE;
	
	public ClaseGenericaII(K objetoK, T objetoT, E objetoE) {
		this.objetoK = objetoK;
		this.objetoT = objetoT;
		this.objetoE = objetoE;
	}
	
	public void mostrarTipo() {
		System.out.println(objetoK.getClass().getName());
		System.out.println(objetoT.getClass().getName());
		System.out.println(objetoE.getClass().getName());
	}
	
	
	
}
