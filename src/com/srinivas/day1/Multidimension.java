package com.srinivas.day1;

import java.util.Scanner;

public class Multidimension {
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the dimensions");
		int m,n;
        m=v.nextInt();
        n=v.nextInt();
        int arr[][]=new int[m][n];
		System.out.println("Enter elements");
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		arr[i][j]=v.nextInt();
        	}
        }
        System.out.println("enter element to be searched");
        int ele=v.nextInt();
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(ele==arr[i][j])
        		{
        			System.out.println("element found");
        			System.exit(0);
        		}
        	}
        }
        System.out.println("element not found");
        v.close();
	}

}
