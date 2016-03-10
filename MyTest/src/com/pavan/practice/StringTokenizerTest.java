package com.pavan.practice;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String args[]) {
		StringTokenizer st = new StringTokenizer("Om_Sai_Ram","_");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}