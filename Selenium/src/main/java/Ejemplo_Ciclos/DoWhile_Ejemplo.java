package Ejemplo_Ciclos;

public class DoWhile_Ejemplo {

	public static void main(String[] args) {
		int b = 10;
		
		do {
			//El codigo dentro del do se imprime incluso si la condicion es falsa
			System.out.println("el valor de b es: " + b);
			b++;
		}while (b <= 20); 

	}

}
