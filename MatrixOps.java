import java.util.Scanner;
public class MatrixOps{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int rows = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols = sc.nextInt();

		int[][] matrix1 = new int[rows][cols];
		int[][] matrix2 = new int[rows][cols];
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.println("Enter element: ");
				matrix1[i][j] = sc.nextInt();
			}
		}
			
		System.out.println("\nThe 1st matrix is:");
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
			System.out.print(matrix1[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
		for(int i=0; i<rows; i++){
			for(int j=0; j<cols; j++){
				System.out.println("Enter element: ");
				matrix2[i][j] = sc.nextInt();
			}
		}
			
		System.out.println("\nThe 2nd matrix is:");
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
			System.out.print(matrix2[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
		System.out.println("\nThe sum matrix is:");
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
			System.out.print(matrix1[i][j]+matrix2[i][j]+" ");
		    }
		    System.out.println();
		}
		
		
		System.out.println("\nThe difference matrix is:");
		for (int i = 0; i < rows; i++) {
		    for (int j = 0; j < cols; j++) {
			System.out.print(matrix1[i][j]-matrix2[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}



