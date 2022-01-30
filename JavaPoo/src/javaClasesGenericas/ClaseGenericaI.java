package javaClasesGenericas;

public class ClaseGenericaI<T> {
	private T nomObjeto;

	public ClaseGenericaI(T nomObjeto) {
		this.nomObjeto = nomObjeto;
	}
	
	public void mostrarObjeto() {
		System.out.println(nomObjeto.getClass().getName());
	}
	
	
	
}
