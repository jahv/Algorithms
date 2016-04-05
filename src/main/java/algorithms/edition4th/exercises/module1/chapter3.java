package algorithms.edition4th.exercises.module1;

import algorithms.edition4th.data.structures.impl.Node;
import algorithms.edition4th.data.structures.impl.StackImpl;

public class chapter3 {

	public static void main(String[] args) {
		System.out.println(parenthesesBalnaced("[(])"));
		System.out.println(parenthesesBalnaced("[({})]({[dd]})[][]{}(())({})"));
		
		
	}
	
	
	
	public static boolean parenthesesBalnaced(String p) {
		StackImpl<String> parentheses = new StackImpl<String>();
		boolean result = true;
		String pop;
		for(int i = 0; i < p.length(); i++) {
			switch(p.charAt(i)) {
				case '(':
				case '[':
				case '{':
					parentheses.push(new Node<String>(String.valueOf(p.charAt(i))));
					break;
				case ')':
					pop = parentheses.pop().getData();
					if(!pop.equals("(")) {
						result = false;
						i = p.length();
					}
					break;
				case ']':
					pop = parentheses.pop().getData();
					if(!pop.equals("[")) {
						result = false;
						i = p.length();
					}
					break;
				case '}':
					pop = parentheses.pop().getData();
					if(!pop.equals("{")) {
						result = false;
						i = p.length();
					}
					break;
			}
		}
		
		return result;
	}
}
