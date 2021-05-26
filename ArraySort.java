import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1Scanner= new Scanner(System.in);
		
		int i,j,num,size,temp;
		
		System.out.println("ENter size of array:  ");
		size=sc1Scanner.nextInt();
		 int[] arr= new int[size];
		 
		 System.out.println("Enter elements of Array:  ");
		 
		 for(i=0;i<arr.length;i++)
		 {
			 arr[i]=sc1Scanner.nextInt();
		 }
		 
		 for(i=0;i<arr.length;i++)
		 {
			 for(j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println(" Sorted array is : ");
		 for(i=0;i<arr.length;i++)
		 {
			 System.out.println(arr[i]);
		 }
		

	}

}
