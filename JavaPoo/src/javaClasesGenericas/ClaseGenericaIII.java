package javaClasesGenericas;

public class ClaseGenericaIII<T> {
	private T varGenerico;
	private String materia;

	
	public ClaseGenericaIII() {
		this.varGenerico = null;
	}

	public ClaseGenericaIII(String materia) {
		varGenerico = null;
		this.materia = materia;
	}
	
	public T getVarGenerico() {
		return varGenerico;
	}

	public void setVarGenerico(T varGenerico) {
		this.varGenerico = varGenerico;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
}
