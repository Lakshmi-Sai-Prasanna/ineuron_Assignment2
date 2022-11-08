package ineuron;
import java.util.Scanner;
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[7];
		//int[] arr={1,2,1,3,4,5,4};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements of array:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The Elements are as follows:");
		for(int ele:arr)
		{
			System.out.println(ele);
		}
		System.out.println("Duplicate Numbers are:");	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}


	}

}
