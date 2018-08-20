package com.srinivas.day1;
  import java.util.Scanner;

public class SentenceCorrection {
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		System.out.println("Enter the sentence.");
		String input=v.nextLine();
		String[] arr=input.split(" ");
		//System.out.println("Enter the word to be deleted.");
		//String word=v.nextLine();
		System.out.println("Enter position of word");
		int pos=v.nextInt()-1;
		
		for(int i=pos;i<arr.length;i++)
		{
			arr[pos]=arr[pos+1];
		}
		
	//	arr[pos]="";
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] +" ");
		}
		/*
		 * 	String w="";
		for(int i=0;i<arr.length;i++)
		{
			if(i!=pos)
			w= w+ arr[i] + " ";
		}
		
			System.out.print(w);
		
		 */
	}

}
