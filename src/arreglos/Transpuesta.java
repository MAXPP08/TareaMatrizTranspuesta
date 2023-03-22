package arreglos;

public class Transpuesta {
	public static void main(String[] args) {
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}}; // Matriz de ejemplo
        int[][] transpuesta = new int[3][3]; // Matriz para guardar la transpuesta
        
        // Calculamos la transpuesta
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                transpuesta[j][i] = matriz[i][j];
            }
        }
        
        // Mostramos la matriz original
        System.out.println("Matriz original:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
        // Mostramos la matriz transpuesta
        System.out.println("Matriz transpuesta:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
	}
}
