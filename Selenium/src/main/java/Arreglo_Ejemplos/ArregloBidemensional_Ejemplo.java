package Arreglo_Ejemplos;

public class ArregloBidemensional_Ejemplo {

	public static void main(String[] args) {
		int arr[][] = {{2, 7, 9}, {3, 6, 7}, {7, 4, 2}};
		//System.out.println(arr[1][2]);

		for(int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}

}
