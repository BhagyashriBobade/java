import java.util.Scanner;
import java.util.Arrays;

public class Display2Darray {

	public static void main(String[] args) {
		
		
		Scanner sc1= new Scanner(System.in);
		int i,j;
	
		
		int[][] arr= new int[2][2];
		
		System.out.println("Enter elements of 2D array: ");
		
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				arr[i][j]=sc1.nextInt();
				
			}

		}
		
		System.out.println(" 2D array is: ");
		
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
		System.out.println();

		}
     
		
		
		
	}

}
