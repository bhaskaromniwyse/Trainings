package com.assignment3;


import java.util.Stack;

public class InfixExpressionToPostfixExpression {

	public int opratorPriarity(char ch) {
		if (ch == '*')
			return 2;
		if (ch == '/')
			return 2;
		if (ch == '+')
			return 1;
		if (ch == '-')
			return 1;
		return 0;
	}

	public boolean isChar(char ch) {
		if (ch >= 'a' && ch <= 'z') {
			return true;
		} else if (ch >= 'A' && ch <= 'Z') {
			return true;
		} else if (ch >= '0' && ch <= '9')
			return true;
		else
			return false;
	}

	boolean isOperator(char ch) {
		if (ch == '/' || ch == '*' || ch == '+' || ch == '-')
			return true;
		else
			return false;
	}

	public String postFixConvert(String str) {
		// Queue<Character> q = null;
		Stack<Character> s = new Stack<Character>();
		String pstr = "";
		char ch;
		int p = 0, i;
		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (isChar(ch)) {
				pstr += ch;

			} else if (isOperator(ch)) {
				if (!s.isEmpty() && !(opratorPriarity(ch) != 0 && opratorPriarity(s.peek()) < opratorPriarity(ch))) {
					pstr += s.peek();
					s.pop();

				}
				s.push(ch);
			}
			if (i == (str.length()) - 1) {
				while (!s.isEmpty()) {
					pstr += s.peek();
					s.pop();
				}
			}
		}
		return pstr;
	}

	public static void main(String ar[]) {
		String istr = "3+4*5/6";
		System.out.println("infix string  =  " + istr);
		String pstr = new InfixExpressionToPostfixExpression().postFixConvert(istr);
		System.out.println("postfix string  =  " + pstr);
	}

}
