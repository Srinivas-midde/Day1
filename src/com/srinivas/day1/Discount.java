package com.srinivas.day1;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {
		Scanner v=new Scanner(System.in);
		float val,dis=35,fin;
		System.out.println("Enter original price");
		val=v.nextFloat();
		fin=(float) (val-val*0.35);
		System.out.println("Initial value:"+val);
		System.out.println("discount:"+dis);
		System.out.println("Final price:"+fin);
		v.close();
	}

}
