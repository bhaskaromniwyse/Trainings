package com.assignment2;


import java.util.Stack;


public class ExpressionChecking {
	
	public static boolean isParenthesisMatch(String str) {
	    Stack<Character> stack = new Stack<Character>();

	    char c;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);

	        if(c != ' '){
	        	if(c == '{')
	        		stack.push(c);
	            if(c == '(')
		            stack.push(c);
		        if(c == '[')
			        stack.push(c);
			    if(c == '}'){
	                if(stack.empty())
	                    return false;
	                else if(stack.peek() == '{'){
	                    stack.pop();
	                } 
			    }else if(c == ')'){
		            if(stack.empty())
		                return false;
		            else if(stack.peek() == '('){
		                    stack.pop();
		            }
		            
	        }else if(c == ']'){
		            if(stack.empty())
		                return false;
		            else if(stack.peek() == '['){
		                    stack.pop();
		            }
	        }
		                    
	        }
	    }
	        return stack.empty();
	}

	public static void main(String[] args) {        
	    String str = "{[";
	    
	    System.out.println(isParenthesisMatch(str)); 
	}
}
