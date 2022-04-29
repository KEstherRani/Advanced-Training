package com.esther.p2_3;

public class ArrayComputation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,avg,sml=0;
		int A[] = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};
		for(int i=0;i<=14;i++)
		{
			sum+=A[i];
			if(A[i]<A[i+1])
			{
				sml=A[i];
			}
		}
		A[15]=sum;
		avg=sum/14;
		A[16]=avg;
		A[17]=sml;
		System.out.println("Sum Value in  A[15]: "+A[15]);
		System.out.println("Av Value in Array at index A[16]: "+A[16]);
		System.out.println("Smallest Value in Array at index A[17]: "+A[17]);
		
		

	}

}
