package com.java.practice;

import java.util.Stack;

public class OpenCloseBracketsValidate { 
	
	public static void main(String[] args) {
		
		/*
		 * Push operation is basically pushes an element into stack at the top (Stack follows LIFO)
		 * pop operation removes the element at the top
		 * 
		 */
		
		String str = "(){}";
		if (isBalanced(str))
            System.out.println("True");
        else
            System.out.println("False");
	}
	
	
	public static boolean isBalanced(String str)
	{
		char[] ch = str.toCharArray();
		Stack<Character> stack = new Stack<>(); //Stack follows Last In First Out(LIFO) order.
		
		for(Character c : ch)
		{
			if(c == '{' || c == '(' || c=='[')
			{
				stack.push(c); //push() method will add the element into stack
			}
			else if(c == '}' || c == ')' || c==']')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				
				char top = stack.pop(); //pop() method will fetch the latest element from stack and removes that element from stack
				
				if(!((c=='}' && top=='{') || (c==')' && top=='(') || (c==']'&& top=='[')))
				{
					return false;
				}
			}
		}
		
	    return stack.isEmpty(); //Finally the stack is empty -- returns True.
		
	}

}
