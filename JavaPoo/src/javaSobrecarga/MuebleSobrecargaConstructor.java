package javaSobrecarga;

public class MuebleSobrecargaConstructor {	
		
		private String material;
		private String color;
		private String descripcion;
		
		/*Sobrecarga de Cosntructor*/
		
		public MuebleSobrecargaConstructor(String material, String color, String descripcion) {
			this.material = material;
			this.color = color;
			this.descripcion = descripcion;
		}

		public MuebleSobrecargaConstructor() {
			this.material = "";
			this.color = "";
			this.descripcion = "";
		}
		
		public MuebleSobrecargaConstructor(String color, String descripcion) {
			this.material = "Madera";
			this.color = color;
			this.descripcion = descripcion;
		}

		public String getMaterial() {
			return material;
		}

		public void setMaterial(String material) {
			this.material = material;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		
		
		
		
		

}
