package org.cts;

public class Sample {
public static void main(String[] args) {
	int a[]=new int[6];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	
	int length = a.length;
	System.out.println("length");
	
	for (int i = 2; i < a.length; i++) {
	System.out.println(a[i]);	
	}
	for (int i : a) {
		System.out.println(i);
	}
	
}
}
