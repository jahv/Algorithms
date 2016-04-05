package algorithms.edition4th.data.structures.impl;

import algorithms.edition4th.data.structures.definition.ListInterface;
import algorithms.edition4th.data.structures.definition.QueueInterface;

public class QueueImpl<T> implements QueueInterface<T> {

	private ListInterface<T> queue;
	
	public QueueImpl() {
		queue = new ListImpl<T>();
	}
	
	@Override
	public Long size() {
		return queue.size();
	}

	@Override
	public void enqueue(final Node<T> node) {
		queue.insertFirst(node);
	}

	@Override
	public Node<T> dequeue() {
		return queue.removeLast();
	}

	@Override
	public Node<T> peek() {
		return queue.end();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return queue.toString();
	}

	
}
