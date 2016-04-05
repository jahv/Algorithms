package algorithms.edition4th.data.structures.definition;

import algorithms.edition4th.data.structures.impl.Node;

public interface QueueInterface<T> {
	Long size();
	void enqueue(final Node<T> node);
	Node<T> dequeue();
	Node<T> peek();
}
