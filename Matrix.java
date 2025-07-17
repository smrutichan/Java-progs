import java.util.Scanner;
public class Matrix{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		for(int a=0; a<2; a++){
			System.out.println("Enter no of rows for the matrix: ");
			int rows = sc.nextInt();
			System.out.println("Enter no of columns for the matrix: ");
			int cols = sc.nextInt();
			
			int[][] mat = new int[rows][cols];
			
			for(int i=0; i<rows; i++){
				for(int j=0; j<cols; j++){
					System.out.println("Enter element: ");
					mat[i][j] = sc.nextInt();
				}
			}
			
			System.out.println("\nThe entered matrix is:");
			for (int i = 0; i < rows; i++) {
			    for (int j = 0; j < cols; j++) {
				System.out.print(mat[i][j] + " ");
			    }
			    System.out.println();
			}
			
			System.out.println("Enter element to search in the matrix: ");
			int target = sc.nextInt();
			int flag = 0;
			for (int i = 0; i < rows; i++) {
			    for (int j = 0; j < cols; j++) {
				if(mat[i][j] == target){
					System.out.println("Data found");
					flag = 1;
				}	
			    }
			}
			if(flag == 0)
				System.out.println("Data not found");
			
		}
			
	}
}
