package algorithms.edition4th.data.structures.definition;

import algorithms.edition4th.data.structures.impl.Node;

public interface ListInterface<T> {

	/**
	 * Verify if list is empty
	 * @return
	 */
	Boolean isEmpty();
	
	/**
	 * Get size of list
	 * @return
	 */
	Long size();
	
	/**
	 * Get the start node
	 * @return
	 */
	Node<T> start();
	
	/**
	 * Get the end node
	 * @return
	 */
	Node<T> end();
	
	/**
	 * Insert at the beginning of the list
	 * @param node
	 */
	void insertFirst(final Node<T> node);
	
	/**
	 * Insert at the end of the list
	 * @param node
	 */
	void insertLast(final Node<T> node);
	
	/**
	 * Insert at specific index
	 * @param index
	 * @param node
	 */
	void insertAt(final Long index, final Node<T> node);
	
	/**
	 * Remove from the beginning of the list
	 * @return
	 */
	Node<T> removeFirst();
	
	/**
	 * Remove from the end of the list
	 * @return
	 */
	Node<T> removeLast();
	
	/**
	 * Remove from an specific index
	 * @return
	 */
	Node<T> removeAt(final Long index);
	
	/**
	 * Find an element based on key
	 * @param key
	 * @return Node found, null if no matches
	 */
	Node<T> find(final T key);
	
	/**
	 * Removes a node after node with key value
	 * @param key
	 * @return removed node
	 */
	Node<T> removeAfter(final T key);
	
}
