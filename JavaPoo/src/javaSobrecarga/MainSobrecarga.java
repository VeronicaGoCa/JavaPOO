package javaSobrecarga;

public class MainSobrecarga {

	public static void main(String[] args) {
		System.out.println("------Sobrecarga de Metodos -----");
		MultiplicacionSobrecarga mul = new MultiplicacionSobrecarga();
		System.out.println(mul.multiplicar(2, 4));
		System.out.println(mul.multiplicar(2, 4, 5));
		System.out.println(mul.multiplicar(2.2, 4.3));
		
		System.out.println("-----Sobrecarga de metodos aplcando Varargs -----");
		MultSobrecargaVarargs mul1 = new MultSobrecargaVarargs();
		System.out.println(mul1.multiplicar(2,3,1,1,1,3));
		System.out.println(mul1.multiplicar(2.3,3.4,1.4,1.6,1.5,3.5));
		System.out.println(mul1.multiplicar(2,3.4,1.4,1,1,3));

		System.out.println("-----Sobrecarga de constructores -----");
		MuebleSobrecargaConstructor mesa = new MuebleSobrecargaConstructor("Cafe", "mesa de dos patas");
		System.out.println(mesa.getMaterial());
		System.out.println(mesa.getColor());
		System.out.println(mesa.getDescripcion());
		
		MuebleSobrecargaConstructor mesa1 = new MuebleSobrecargaConstructor("Carton prensado","Cafe", "mesa de dos patas");
		System.out.println(mesa1.getMaterial());
		System.out.println(mesa1.getColor());
		System.out.println(mesa1.getDescripcion());
		
	}

}
