package week1.day2;

import java.util.Iterator;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
		for (int count=0; count < arr.length; count++) 
		{
			for (int i=count+1; i< arr.length; i++)
			{
				
				if (arr[count]==arr[i])
				{
				
					System.out.println(arr[count]);
				
				}
			}

}
	}
}