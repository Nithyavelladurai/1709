package org.cts;

public class Sample2 {
public static void main(String[] args) {
	int a[][]=new int[4][4];
	a[0][0]=10;
	a[0][1]=20;
	a[0][2]=30;
	a[0][3]=130;
	a[1][0]=40;
	a[1][1]=50;
	a[1][2]=60;
	a[1][3]=140;
	a[2][0]=70;
	a[2][1]=80;
	a[2][2]=90;
	a[2][3]=150;
	a[3][0]=100;
	a[3][1]=110;
	a[3][2]=120;
	a[3][3]=160;
	int length = a.length;
	System.out.println(length);
	System.out.println(a[3][2]);
	System.out.println("-----------");
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[i][j]);
		}
		System.out.println("------------");
	}
	for (int[] is : a) {
		 for (int i : is) {
			
		
			System.out.println(i);
		}
	}
	
	
	
	
	
}
}
