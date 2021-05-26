import java.util.Scanner;

public class Merge2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1= new Scanner(System.in);
		int i;
		
		
		System.out.println(" Enter size of 1st array: ");
		int size1 =sc1.nextInt();
		
        System.out.println(" Enter size of 2nd Array: ");
       int size2=sc1.nextInt();
     
       
       int[] arr1 = new int[size1];
       int[] arr2 = new int[size2];
       int[] arr3= new int[size1+size2];
       
       System.out.println("Enter 1st Array elements: ");
       for(i=0;i<arr1.length;i++)
       {
    	   arr1[i]= sc1.nextInt();
       }
       
       System.out.println(" Enter 2nd Array elements: ");
       for(i=0;i<arr2.length;i++)
       {
            arr2[i]= sc1.nextInt();
       }
       
       System.out.println("After Merging two Arrays: ");
       
       for(i=0;i<arr1.length;i++)
       {
    	   arr3[i]=arr1[i];
    	   
       }
       
       for(i=0;i<arr2.length;i++)
       {
    	   arr3[arr1.length + i]= arr2[i];
       }
       for(int k: arr3)
       {
    	   System.out.println(k);
       }
	}

}
