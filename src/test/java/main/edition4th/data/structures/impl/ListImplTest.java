package algorithms.edition4th.data.structures.impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import algorithms.edition4th.data.structures.definition.ListInterface;
import algorithms.edition4th.data.structures.impl.ListImpl;
import algorithms.edition4th.data.structures.impl.Node;

public class ListImplTest {

	private ListInterface<Integer> list;

	@Before
	public void setUp() {
		list = new ListImpl<Integer>();
	}

	@Test
	public void testPrint() {
		final String toString = list.toString();

		System.out.println(toString);
		Assert.assertEquals("NULL", toString);
	}

	@Test
	public void testInsertFirst() {
		Assert.assertTrue(list.size() == 0);
		System.out.println(list.toString());

		for (int i = 1; i <= 5; i++) {
			Node<Integer> node = new Node<Integer>(i);
			list.insertFirst(node);
			System.out.println(list.toString());
			Assert.assertTrue(list.size() == i);
		}

		final String actual = list.toString();
		final String expected = "5 -> 4 -> 3 -> 2 -> 1 -> NULL";
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testInsertLast() {
		Assert.assertTrue(list.size() == 0);
		System.out.println(list.toString());

		for (int i = 1; i <= 5; i++) {
			Node<Integer> node = new Node<Integer>(i);
			list.insertLast(node);
			System.out.println(list.toString());
			Assert.assertTrue(list.size() == i);
		}

		final String actual = list.toString();
		final String expected = "1 -> 2 -> 3 -> 4 -> 5 -> NULL";
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testInsertAt() {
		final Node<Integer> n0 = new Node<Integer>(0);
		final Node<Integer> n1 = new Node<Integer>(1);
		final Node<Integer> n2 = new Node<Integer>(2);
		final Node<Integer> n3 = new Node<Integer>(3);
		final Node<Integer> n4 = new Node<Integer>(4);
		final Node<Integer> n5 = new Node<Integer>(5);
		final Node<Integer> n6 = new Node<Integer>(6);
		final Node<Integer> n7 = new Node<Integer>(7);
		
		list.insertAt(list.size() + 1, n5);
		Assert.assertTrue(list.size() == 1);
		System.out.println(list.toString());
		
		list.insertAt(0L, n1);
		Assert.assertTrue(list.size() == 2);
		System.out.println(list.toString());
		
		list.insertAt(-1L, n0);
		Assert.assertTrue(list.size() == 3);
		System.out.println(list.toString());
		
		list.insertAt(2L, n2);
		Assert.assertTrue(list.size() == 4);
		System.out.println(list.toString());
		
		list.insertAt(3L, n3);
		Assert.assertTrue(list.size() == 5);
		System.out.println(list.toString());
		
		list.insertAt(5L, n6);
		Assert.assertTrue(list.size() == 6);
		System.out.println(list.toString());
		
		list.insertAt(4L, n4);
		Assert.assertTrue(list.size() == 7);
		System.out.println(list.toString());
		
		list.insertAt(list.size(), n7);
		Assert.assertTrue(list.size() == 8);
		System.out.println(list.toString());
	}
	
	@Test
	public void testRemoveFirst() {
		for (int i = 1; i <= 5; i++) {
			Node<Integer> node = new Node<Integer>(i);
			list.insertFirst(node);
		}
		System.out.println(list.toString());
		
		for(Integer i=5; i >= 1; i--) {
			Node<Integer> r = list.removeFirst();
			System.out.println(list.toString());
			Assert.assertEquals(i, r.getData());
		}
		
		final Node<Integer> r = list.removeFirst();
		Assert.assertNull(r);
		Assert.assertTrue(list.size() == 0);
	}
	
	@Test
	public void testRemoveLast() {
		for (int i = 1; i <= 5; i++) {
			Node<Integer> node = new Node<Integer>(i);
			list.insertLast(node);
		}
		System.out.println(list.toString());
		
		for(Integer i=5; i >= 1; i--) {
			Node<Integer> r = list.removeLast();
			System.out.println(list.toString());
			Assert.assertEquals(i, r.getData());
		}
		
		final Node<Integer> r = list.removeLast();
		Assert.assertNull(r);
		Assert.assertTrue(list.size() == 0);
	}
	
	@Test
	public void testRemoveAt() {
		for (int i = 0; i <= 7; i++) {
			Node<Integer> node = new Node<Integer>(i);
			list.insertLast(node);
		}
		System.out.println(list.toString());
		
		Node<Integer> r = list.removeAt(-1L);
		System.out.println(list.toString());
		Assert.assertNull(r);
		
		r = list.removeAt(0L);
		System.out.println(list.toString());
		Assert.assertEquals(new Integer(0), r.getData());
		
		r = list.removeAt((list.size() + 1));
		System.out.println(list.toString());
		Assert.assertEquals(new Integer(7), r.getData());
		
		r = list.removeAt((list.size()));
		System.out.println(list.toString());
		Assert.assertEquals(new Integer(6), r.getData());
		
		r = list.removeAt(2L);
		System.out.println(list.toString());
		Assert.assertEquals(new Integer(3), r.getData());
		
		r = list.removeAt(3L);
		System.out.println(list.toString());
		Assert.assertEquals(new Integer(5), r.getData());
		
		r = list.removeAt(1L);
		System.out.println(list.toString());
		Assert.assertEquals(new Integer(2), r.getData());
		
		r = list.removeAt(1L);
		System.out.println(list.toString());
		Assert.assertEquals(new Integer(4), r.getData());
		
		r = list.removeAt(list.size());
		System.out.println(list.toString());
		Assert.assertEquals(new Integer(1), r.getData());
		
		r = list.removeAt(1L);
		System.out.println(list.toString());
		Assert.assertNull(r);
	}
	
	@Test
	public void testFind() {
		list.insertFirst(new Node<Integer>(3));
		list.insertFirst(new Node<Integer>(2));
		list.insertFirst(new Node<Integer>(1));
		
		Node<Integer> found = list.find(5);
		Assert.assertNull(found);
		
		found = list.find(3);
		Assert.assertNotNull(found);
		Assert.assertEquals(new Integer(3), found.getData());
		
		found = list.find(1);
		Assert.assertNotNull(found);
		Assert.assertEquals(new Integer(1), found.getData());
		
		found = list.find(2);
		Assert.assertNotNull(found);
		Assert.assertEquals(new Integer(2), found.getData());
		
	}
	
	@Test
	public void testRemoveAfter() {
		list.insertLast(new Node<Integer>(1));
		list.insertLast(new Node<Integer>(2));
		list.insertLast(new Node<Integer>(3));
		
		Node<Integer> removed = list.removeAfter(2);
		Assert.assertNotNull(removed);
		Assert.assertEquals(new Integer(3), removed.getData());
		
		removed = list.removeAfter(1);
		Assert.assertNotNull(removed);
		Assert.assertEquals(new Integer(2), removed.getData());
		
		removed = list.removeAfter(1);
		Assert.assertNull(removed);
		
	}
}
