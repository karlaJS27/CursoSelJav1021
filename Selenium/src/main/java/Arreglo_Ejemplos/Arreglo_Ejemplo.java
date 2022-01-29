package Arreglo_Ejemplos;

public class Arreglo_Ejemplo {

	public static void main(String[] args) {
		//ambas son declaraciones validos
		int intArray[];
				int [] intArray2;
				
				//Declarar un array de strings
				String[] arr;
				
				//Asignar memoria para 6 espacios
				arr = new String[6];
				
				//iniciar el primer elemento array
				arr[0] = "cero";
				
				//iniciar el segundo elemento
				arr[1] = "uno";
				arr[2] = "dos";
				arr[3] = "tres";
				arr[4] = "cuatro";
				arr[5] = "cinco";
				
				//acceder a todos los elementos del Array
				
				for(int i = 0; i < arr.length; i++) {
					System.out.println("Elemento en el indice" + i + ": " + arr[i]);
				}
	}

}
