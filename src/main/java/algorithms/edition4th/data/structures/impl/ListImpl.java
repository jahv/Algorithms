package algorithms.edition4th.data.structures.impl;

import algorithms.edition4th.data.structures.definition.ListInterface;

/**
 * Implementation of <{@link ListInterface}
 * 
 * @author jose.hernandez
 *
 * @param <T>
 */
public class ListImpl<T> implements ListInterface<T> {
	private Long size;
	private Node<T> start;
	private Node<T> end;
	
	public ListImpl() {
		start = null;
		end = null;
		size = 0L;
	}

	@Override
	public Boolean isEmpty() {
		if(size == 0) {
			return true;
		}
		return false;
	}

	@Override
	public Long size() {
		return this.size;
	}

	@Override
	public void insertFirst(final Node<T> node) {
		if(isEmpty()) {
			start = node;
			end = node;
		} else {
			node.next = start;
			start = node;
		}
		size++;
	}

	@Override
	public void insertLast(final Node<T> node) {
		if(isEmpty()) {
			start = node;
			end = node;
		} else {
			end.next = node;
			end = node;
		}
		size++;
	}

	@Override
	public void insertAt(final Long index, final Node<T> node) {
		if(index >= 0) {
			if(index == 0) {
				insertFirst(node);
			} else if(index >= size) {
				insertLast(node);
			} else {
				int counter = 0;
				Node<T> aux = start;
				while(counter < (index - 1)) {
					aux = aux.next;
					counter++;
				}
				node.next = aux.next;
				aux.next = node;
				size++;
			}
		} else {
			insertFirst(node);
		}
	}

	@Override
	public Node<T> removeFirst() {
		Node<T> remove = null;
		if(!isEmpty()) {
			remove = start;
			start = start.next;
			remove.next = null;
			size--;
		}
		return remove;
	}

	@Override
	public Node<T> removeLast() {
		Node<T> remove = null;
		if(!isEmpty()) {
			if(size == 1) {
				remove = end;
				end = null;
				start = null;
			} else {
				remove = end;
				Node<T> aux = start;
				while(aux.next != end) {
					aux = aux.next;
				}
				end = aux;
				aux.next = null;
			}
			size--;
		}
		return remove;
	}

	@Override
	public Node<T> removeAt(final Long index) {
		Node<T> remove = null;
		if(index >= 0) {
			if(index == 0) {
				remove = removeFirst();
			} else if (index >= size) {
				remove = removeLast();
			} else {
				int counter = 0;
				Node<T> aux = start;
				while(counter < (index - 1)) {
					aux = aux.next;
					counter++;
				}
				remove = aux.next;
				aux.next = aux.next.next;
				remove.next = null;
				size--;
				
				if(size == 1) {
					end = start;
				}
			}
		}
		return remove;
	}
	
	@Override
	public Node<T> find(T key) {
		Node<T> aux = start;
		while(aux.next != null) {
			if(aux.getData().equals(key)){
				break;
			}
			aux = aux.next;
		}
		if(aux == end && !aux.getData().equals(key)) {
			aux = null;
		}
		return aux;
	}
	
	@Override
	public Node<T> removeAfter(final T key) {
		Node<T> aux = start;
		while(aux.next != null) {
			if(aux.getData().equals(key)) {
				break;
			}
			aux = aux.next;
		}
		if(aux == end) {
			return null;
		}
		if(aux.next == end) {
			end = aux;
		}
		final Node<T> node = aux.next;
		aux.next = aux.next.next;
		node.next = null;
		size--;
		return node;
	}

	/**
	 * Iterate the whole list to print the value of the node
	 */
	@Override
	public String toString() {
		final StringBuilder print = new StringBuilder();
		Node<T> aux = start;
		while(aux != null) {
			print.append(aux);
			print.append(" -> ");
			aux = aux.next;
		}
		
		print.append("NULL");
		return print.toString();
	}

	@Override
	public Node<T> start() {
		return start;
	}

	@Override
	public Node<T> end() {
		return end;
	}
}
