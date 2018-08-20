package com.srinivas.day1;
 
import java.util.Scanner;
public class Itax {
	public static void main(String[] args)
	{
		double salary,temp,tax;
		Scanner v= new Scanner(System.in);
		salary=v.nextInt();
		if(salary>0 && salary<180000)
			System.out.println("nil");
		else if(salary>181001 && salary<300000)
		{
			temp=salary;
			tax=(temp-180000)*0.1;
			System.out.println("Tax applicable is:" + tax);
		}
		else if(salary>300001 && salary<500000)
		{
			temp=salary;
			tax=(temp-300000)*0.2+(120000*0.1);
			System.out.println("Tax applicable is:" + tax);
		}
		else if(salary>500001 && salary<1000000)
		{
			temp=salary;
			tax=(temp-500000)*0.1+(120000*0.1)+(200000*0.2);
			System.out.println("Tax applicable is:" + tax);
		}
		else
		   System.out.println("enter a positive value");
		v.close();
	}

}
