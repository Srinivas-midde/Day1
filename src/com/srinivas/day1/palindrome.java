package com.srinivas.day1;
  import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
		String palin="",str="";
		Scanner v=new Scanner(System.in);
		palin=v.nextLine();
		int n=palin.length();
		v.close();
		for(int i=n-1;i>=0;i--)
		{
			str= str + palin.charAt(i);
		}
		if(palin.equals(str))
			System.out.println("Given string is a palindrome");
		else
			System.out.println("not a palindrome");
	}

}
