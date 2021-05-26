import java.util.Scanner;

public class Sum2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1= new Scanner(System.in);
		
		int i,j;
		
		int[][] arr1= new int[2][2];
		
		int[][] arr2= new int[2][2];
		
		int[][] arr3= new int[2][2];
		
		System.out.println("Enter elements of 1st 2D array: ");
		
		for(i=0;i<2;i++)
		{
		     for(j=0;j<2;j++)
		     {
		    	 arr1[i][j]=sc1.nextInt();
		     }
		}
		
		System.out.println("Enter elements of 2nd 2D array: ");
		
		
		for(i=0;i<2;i++)
		{
		     for(j=0;j<2;j++)
		     {
		    	 arr2[i][j]=sc1.nextInt();
		     }
		}
		
		System.out.println("Sum of 2D array is :  ");
		
		for(i=0;i<2;i++)
		{
			 for(j=0;j<2;j++)
			 {
				 arr3[i][j] = arr1[i][j]+arr2[i][j];
				 
			 }
		}
		
		for(i=0;i<2;i++)
		{
			 for(j=0;j<2;j++)
			 {
				 System.out.println(arr3[i][j]);
				 
			 }
		}
		
	}

}
