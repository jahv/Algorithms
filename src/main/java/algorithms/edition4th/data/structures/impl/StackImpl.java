package algorithms.edition4th.data.structures.impl;

import algorithms.edition4th.data.structures.definition.ListInterface;
import algorithms.edition4th.data.structures.definition.StackInterface;

public class StackImpl<T> implements StackInterface<T> {
	
	ListInterface<T> stack;
	
	public StackImpl() {
		stack = new ListImpl<T>();
	}

	@Override
	public Long size() {
		return stack.size();
	}

	@Override
	public void push(Node<T> node) {
		stack.insertFirst(node);
	}

	@Override
	public Node<T> pop() { 
		return stack.removeFirst();
	}

	@Override
	public Node<T> peek() {
		return stack.start();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return stack.toString();
	}
	
	

}
