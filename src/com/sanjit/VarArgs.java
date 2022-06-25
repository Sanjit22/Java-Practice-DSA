package com.sanjit;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(7,8,56,98,44,98,76);
	}
	
	static void fun(int ...v) {
		System.out.println(Arrays.toString(v));
	}

}
