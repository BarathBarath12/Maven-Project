package com.testng;

public class PojoB {
public static PojoA data = new PojoA();
public static void main(String[] args) {
	data.setA(2);
	int a = data.getA();
	int a2 = data.getA();
	System.out.println(a2);
	System.out.println(a);
}
}
