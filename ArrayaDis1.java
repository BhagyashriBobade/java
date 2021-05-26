import java.util.Scanner;

public class ArrayaDis1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc1= new Scanner(System.in);
		
		int j;
		
		System.out.println("Enter size of Array");
		int size;
		size=sc1.nextInt();
		
		int[] arr= new int[size];
		
		System.out.println("ENter elements of Array");
		
		for( j=0;j<arr.length;j++)
		{
			
			arr[j]=sc1.nextInt();
		}
		System.out.println("Array Element");
		for(int i:arr)
		{
			System.out.println(i);
			
		}
	}

}
