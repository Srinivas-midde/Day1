package com.srinivas.day1;
  
import java.util.*;
public class Grade {
	public static void main(String[] args)
	{
		int s1,s2,s3,x=0;
		  Scanner v=new Scanner(System.in);
		  s1=v.nextInt();
		  s2=v.nextInt();
		  s3=v.nextInt();
		  v.close();
		  if(s1>60)
			  x++;
		  if(s2>60)
			  x++;
		  if(s3>60)
			  x++;
		  if(x==1||x==0)
			  System.out.println("Failed");
		  if(x==2)
			  System.out.println("Promoted");
		  if(x==3)
			  System.out.println("Passed");
	}

}