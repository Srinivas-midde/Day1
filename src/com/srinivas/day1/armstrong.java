package com.srinivas.day1;
import java.util.*;
public class armstrong {
    int ams(int n)
    {
    	int x=0;
		while(n>0)
		{
			int i=n%10;
						
			x=x+(i*i*i);
			n=n/10;

			
		}
		return x;
	}
	public static void main(String[] args){
		int num;
		System.out.print("Enter a number");
		Scanner v = new Scanner(System.in);
		num = v.nextInt();
		v.close();
		armstrong a=new armstrong();
		int val = a.ams(num);
		if(val!=num)
			System.out.print("Given number is not an amstrong.");
		else
			System.out.print("Given number is an amstrong.");
	}

}