package com.gl.lab3.question1;

import java.util.Stack;

public class BalancingBrackets {

	public static boolean checkBalancingBracktes(String brackets) {
		
		Stack <Character> opStack =new Stack<Character>();
		for(int i=0;i<brackets.length();i++) {
			char ch = brackets.charAt(i);
			if(ch=='('|| ch=='['||ch=='{') {
				opStack.push(ch);
				continue;
			}
			else if(opStack.isEmpty()){
				return false;
			}
	
			char topOfStack=opStack.pop();
			switch(ch) {
			case ')':				
				if(topOfStack!='(')
					return false;
					break;
				case '}':				
					if(topOfStack!='{')
					return false;
					break;
				case ']':
					if(topOfStack!='[')
					return false;
					break;
				default:
					return false;				
			}
		}
		return opStack.isEmpty();
	}
}
