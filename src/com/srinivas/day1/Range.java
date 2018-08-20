package com.srinivas.day1;

public class Range {
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
	public static void main(String[] args) {
		Range a=new Range();
		int x;
		for(int i=100;i<1000;i++)
		{
			x=a.ams(i);
			if(x==i)
			{
				System.out.println(i);
			}
		}
		
	}

}
