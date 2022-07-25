package com.gl.lab3.question2;

import com.gl.lab3.question2.SumPair.Node;

public class SumPairDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;
		SumPair findSP = new SumPair();
		root=findSP.insert(root,40); 
		root=findSP.insert(root,20);
		root=findSP.insert(root,60);
		root=findSP.insert(root,10);
		root=findSP.insert(root,30);
		root=findSP.insert(root,50);
		root=findSP.insert(root,110);
		
		int sum = 200;
		findSP.findPairWithGivenSum(root, sum);
		
	}

}
