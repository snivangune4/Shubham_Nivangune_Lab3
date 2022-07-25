package com.gl.lab3.question1;

public class BalancingBracketsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brackets ="(([[{{}]}]))";
		boolean isBalanced=BalancingBrackets.checkBalancingBracktes(brackets);
		if(isBalanced) {
			System.out.println("Balanced bracktes");
		}
		else {
			System.out.println("Unbalanced brackets");
		}
	}
}
