import java.util.Scanner;
import java.util.ArrayList;

public class MatrixSetValue{
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of rows");
		int rows= input.nextInt();
		System.out.println("Enter the number of cols");
		int cols= input.nextInt();
		int[][] matrix = new int[rows][cols];

		boolean row[] = new boolean[matrix.length];
		boolean col[] = new boolean[matrix[0].length];

		for (int i=0;i< rows ;i++){
			for (int j =0;j<cols ;j++){
				matrix[i][j]=input.nextInt();
				if (matrix[i][j]==0) {
					row[i] = true;
					col[j] = true;
				}
			}
		}

		for (int i=0;i< rows ;i++){
			for (int j =0;j<cols ;j++){
				if (row[i] || col[j]){
					matrix[i][j]=0;
				}
			}

		}

		for (int i=0;i< rows ;i++){
			for (int j =0;j<cols ;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}

	} 



}