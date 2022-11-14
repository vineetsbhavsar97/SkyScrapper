package com.nt.gl;

import java.util.Scanner;

public class SkyScrapperMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int totalFloors = sc.nextInt();
		int[] arr = new int[totalFloors];
		for (int j = 0; j < arr.length; j++) {
			System.out.println("enter the floor size given on day :" + (j + 1));
			arr[j] = sc.nextInt();
		}
		System.out.println("The order of construction is as follows");
		System.out.println("");
		SkyScrapperMain sky = new SkyScrapperMain();
		sky.toBuild(arr);
		sc.close();

	}
}
