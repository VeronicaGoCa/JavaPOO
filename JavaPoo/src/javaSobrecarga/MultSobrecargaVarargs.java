package javaSobrecarga;

public class MultSobrecargaVarargs {
	
	public int multiplicar(int ...v) {
		int mul = 1;
		for(int i:v) {
			mul = mul * i;
		}
		return mul;
	}
		
	public double multiplicar(double ...v) {
		double mul = 1;
		for(double i:v) {
			mul = mul * i;
		}
		return mul;
	}
}
