package algorithms.edition4th.data.structures.definition;

import algorithms.edition4th.data.structures.impl.Node;

public interface StackInterface<T> {
	Long size();
	void push(final Node<T> node);
	Node<T> pop();
	Node<T> peek();
}
