package algorithms.edition4th.data.structures.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithms.edition4th.data.structures.definition.QueueInterface;
import algorithms.edition4th.data.structures.impl.Node;
import algorithms.edition4th.data.structures.impl.QueueImpl;

public class QueueImplTest {

	private QueueInterface<Integer> queue;

	@Before
	public void setUp() {
		queue = new QueueImpl<Integer>();
	}

	@Test
	public void testEnqueue() {
		Assert.assertTrue(queue.size() == 0);

		for (int i = 1; i <= 5; i++) {
			final Node<Integer> node = new Node<Integer>(i);
			queue.enqueue(node);
			System.out.println(queue);
			Assert.assertTrue(queue.size() == i);
		}
	}
	
	@Test
	public void testDequeue() {
		for (int i = 1; i <= 5; i++) {
			final Node<Integer> node = new Node<Integer>(i);
			queue.enqueue(node);
		}
		System.out.println(queue);
		
		for (int i = 1; i <= 5; i++) {
			final Node<Integer> node = queue.dequeue();
			System.out.println(queue);
			Assert.assertTrue(node.getData() == i);
		}
		
		final Node<Integer> node = queue.dequeue();
		Assert.assertNull(node);
	}
	
	@Test
	public void testPeek() {
		for (int i = 1; i <= 5; i++) {
			final Node<Integer> node = new Node<Integer>(i);
			queue.enqueue(node);
		}
		System.out.println(queue);
		
		for (int i = 1; i <= 5; i++) {
			final Node<Integer> node = queue.peek();
			System.out.println(queue);
			Assert.assertTrue(node.getData() == i);
			queue.dequeue();
		}
		
		final Node<Integer> node = queue.peek();
		Assert.assertNull(node);
	}

}
