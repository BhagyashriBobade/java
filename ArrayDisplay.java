import java.util.Arrays;
import java.util.Scanner;

public class ArrayDisplay {

	public static void main(String[] args) {

		int[] arr;
		int no;
		int choice,sum=0,temp;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Size:");
		int size = sc.nextInt();// size
		arr = new int[size];

		System.out.println("-----Array Operations----");
		System.out.println("1:Read Array");
		System.out.println("2:Show Elements in Array");
		System.out.println("3:Search element in Array");
		System.out.println("4:Sum Of  Array element");
		System.out.println("5:Sort Array");
		System.out.println("6:Exit");

	
		while (flag != false) {
			System.out.println("Enter Choice:");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Array Elements");
				//read array
				for(int i=0;i<arr.length;i++)
				{
					
					arr[i]=sc.nextInt();
				}
				
				break;
			case 2:
				System.out.println("Array Element");
				for(int i:arr)
				{
					System.out.println(i);
					
				}
				
				break;
			case 3:
				System.out.println("Enter Number to Search:");
				no=sc.nextInt();
				
				for(int i=0;i<arr.length;i++)
				{
					
					if(arr[i]==no)
					{
					System.out.println("Number present  at index:"+i);	
						
					}
					else {
						{
							System.out.println("Number is not present5");
						}
					}
					
				}
				
				break;
			case 4:
	
				for(int i:arr)
				{
					sum=sum+i;
					
				}
				
				
				System.out.println("Sum="+sum);
				
				break;
			case 5:
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++)
					{
						if(arr[i]>arr[j])
						{
							temp=arr[i];
							arr[i]= arr[j];
							arr[j]= temp;
						}
						
					}
					
				}
			
			System.out.println("Sorting the array");
			for(int i:arr)
			{
				System.out.println(i);
				
			}
				
				break;
			case 6:
				flag=false;
				break;
				
			default:
				break;

			}

		}

	}

}
