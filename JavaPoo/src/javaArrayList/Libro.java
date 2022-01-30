package javaArrayList;

public class Libro {
	private String autor;
	private String titulo;
	
	public Libro(String autor, String titulo) {
		this.autor = autor;
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}	
	
	@Override
	public String toString() {
		return "Libros [autor=" + autor + ", titulo=" + titulo + "]";
	}

}
