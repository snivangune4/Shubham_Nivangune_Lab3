package com.gl.lab3.question2;

import java.util.HashSet;

public class SumPair {

	static class Node{
		int key;
		Node left,right;
	}
	
	static Node newNode(int value) {
		Node temp = new Node();
		temp.key=value;
		temp.left=null;
		temp.right=null;
		
		return temp;
	}
	
	public Node insert(Node root,int key) {
		if(root==null) {
			return newNode(key);
		}
		
		if(key<root.key) {
			root.left=insert(root.left,key);
		}else {
			root.right=insert(root.right,key);
		}
		return root;	
	}
	
	public void findPairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<>();
		if(!findPairRecurse(root,sum,set)) {
			System.out.println("Pairs do not exist");
		}
	}
	
	public boolean findPairRecurse(Node root, int sum, HashSet<Integer> set) {
		// TODO Auto-generated method stub
		if(root==null)
		return false;
	
	if(findPairRecurse(root.left,sum,set)) {
		return true;
		}
	if(set.contains(sum-root.key)) {
		System.out.println("Pair is found {"+ (sum-root.key)+","+root.key+")");
		return true;
		}
	else set.add(root.key);
	
	return findPairRecurse(root.right,sum,set);
	}
}
