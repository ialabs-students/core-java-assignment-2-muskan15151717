package assigment;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ArrayListSort 
{


		public static void main(String[] args)
		{
			ArrayList<BigInteger> al = new ArrayList<>();

			System.out.println("enter elements in ");
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			BigInteger arr[] = new BigInteger[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextBigInteger();
				
	} 
			for(int i=0;i<n;i++) 
			{
				al.add(arr[i]);
				
			}
			// ascending order sorting in O(nlogn)
			Arrays.sort(arr);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i] + ",");
				
			}
			//descending order sorting
			arrayListSortDesc(al);
			
				
			}

		private static void arrayListSortDesc(ArrayList<BigInteger> al) {
			Collections.sort(al);
			Collections.reverse(al);
			System.out.println();
			System.out.println(al);
			
			
		}
			
}
