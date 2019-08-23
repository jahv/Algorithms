package algorithms.edition4th.data.structures.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithms.edition4th.data.structures.definition.StackInterface;
import algorithms.edition4th.data.structures.impl.Node;
import algorithms.edition4th.data.structures.impl.StackImpl;

public class StackImplTest {

	private StackInterface<Integer> stack;

	@Before
	public void setUp() {
		stack = new StackImpl<Integer>();
	}

	@Test
	public void testPush() {
		Assert.assertTrue(stack.size() == 0);

		for (int i = 1; i <= 5; i++) {
			final Node<Integer> node = new Node<Integer>(i);
			stack.push(node);
			System.out.println(stack);
			Assert.assertTrue(stack.size() == i);
		}
	}
	
	@Test
	public void testPop() {
		for (int i = 1; i <= 5; i++) {
			final Node<Integer> node = new Node<Integer>(i);
			stack.push(node);
		}
		System.out.println(stack);
		
		for (int i = 5; i >= 1; i--) {
			final Node<Integer> node = stack.pop();
			System.out.println(stack);
			Assert.assertTrue(node.getData() == i);
		}
		
		final Node<Integer> node = stack.pop();
		Assert.assertNull(node);
	}
	
	@Test
	public void testPeek() {
		for (int i = 1; i <= 5; i++) {
			final Node<Integer> node = new Node<Integer>(i);
			stack.push(node);
		}
		System.out.println(stack);
		
		for (int i = 5; i >= 1; i--) {
			final Node<Integer> node = stack.peek();
			System.out.println(stack);
			Assert.assertTrue(node.getData() == i);
			stack.pop();
		}
		
		final Node<Integer> node = stack.peek();
		Assert.assertNull(node);
	}

}
