package com.srinivas.day1;
  import java.util.*;
public class Numsqr {
	public static void main(String[] args){
		int supply;
		Scanner in = new Scanner(System.in);
		System.out.print("Supply value: ");
		supply = in.nextInt();
		in.close();
		int n = supply*1;
		int s = supply*supply;
		System.out.println("output:" + supply + "*1=" + n + ",Square:" + s);
		
	}

}
