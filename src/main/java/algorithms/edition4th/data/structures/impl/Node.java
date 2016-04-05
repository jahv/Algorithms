package algorithms.edition4th.data.structures.impl;

public class Node<T> {
	
	private T data;
	public Node<T> next;

	public Node(T data) {
		this.data = data;
		next = null;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String toString = "";
		if(data != null) {
			toString = data.toString();
		}
		return toString;
	}
	
}