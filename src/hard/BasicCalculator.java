package hard;

import java.util.Stack;

public class BasicCalculator {
	
	public static void main(String[] args) {
		int res = calculate("(1+(4+5+2)-3)+(6+8)");
		System.out.println(res);
	}
	
	public static int calculate(String s) {
		Stack<Integer> stack = new Stack<>();
		int res = 0;
		int num = 0;
		int sign = 1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isDigit(c)) {
				num = num * 10 + (c - '0');
			} else if (c == '+') {
				res += sign * num;
				sign = 1;
				num = 0;
			} else if (c == '-') {
				res += sign * num;
				sign = -1;
				num = 0;
			} else if (c == '(') {
				stack.push(res);
				stack.push(sign);
				sign = 1;
				res = 0;
			} else if (c == ')') {
				res += sign * num;
				num = 0;
				res *= stack.pop();
				res += stack.pop();
			}
		}
		if (num > 0) {
			res += sign * num;
		}
		return res;
	}
	
}
