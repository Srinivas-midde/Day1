package com.srinivas.day1;
import java.util.*;

public class Interestrate {

	
	
	
		void si(int p,int t,int r)
		{
			int num;
			num=(p*t*r)/100;
			System.out.println("Simple interest is:" + num);
		}
		void ci(int p,int t,int r)
		{
			double i;
			i=p*Math.pow((1+r*0.01), t);
			i=i-p;
			System.out.println("Compound interst is:" + i);
		}
		public static void main(String[] args)
		{
			int p,t,r;
			System.out.print("Enter the values of p,t,r");
			Scanner in= new Scanner(System.in);
			p= in.nextInt();
			t= in.nextInt();
			r= in.nextInt();
			Interestrate i=new Interestrate();
			i.si(p,t,r);
			i.ci(p, t, r);
			in.close();
		}

	}


