import java.util.Scanner;

public class ArgumentSum {

	     public static void add(int...a)
	     {
	    	 int sum=0;
	    	 System.out.println("Number of Argument: "+a.length);
	    	 
	    	 for(int i=0;i<a.length;i++)
	    	 {
	    		 sum=sum+a[i];
	    	 }
	    	 System.out.println(" Sum of Array is: "+ sum);
	    	 
	     }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		add(1,2,3,4,5,6);
		add(12,13,14,45,67,89,44,99);
		
	

	}

}
