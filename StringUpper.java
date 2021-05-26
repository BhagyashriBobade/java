import java.util.Scanner;

public class StringUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   Scanner sc1= new Scanner(System.in);
	   
	   int i, size;
	   
	   System.out.println("Enter size of Array: ");
	   size = sc1.nextInt();
	   
	   String[] arr= new String[size];
	   
	   System.out.println("Enter String elements of array: ");
	   
	   for(i=0;i<arr.length;i++)
	   {
		   arr[i]= sc1.next();
		   
	   }
	   
	   
	   System.out.println("Display of String elements: ");
	   
	   for(i=0;i<arr.length;i++)
	   {
		   
		    System.out.println(arr[i].toUpperCase());
	   }
	   
	
	
	
	}

}
