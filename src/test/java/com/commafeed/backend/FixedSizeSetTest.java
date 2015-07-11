package com.commafeed.backend;

import java.util.Comparator;

import org.apache.commons.lang3.ObjectUtils;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FixedSizeSetTest {

	private FixedSizeSet<String> set;

	@Before
	public void init() {
		set = new FixedSizeSet<String>(3);
	}

	@Test
	public void testSimpleAdd() {
		set.add("0");
		set.add("1");
		set.add("2");

		Assert.assertEquals("0", set.asList().get(0));
		Assert.assertEquals("1", set.asList().get(1));
		Assert.assertEquals("2", set.asList().get(2));
	}

	@Test
	public void testIsFull() {
		set.add("0");
		set.add("1");

		Assert.assertFalse(set.isFull());
		set.add("2");
		Assert.assertTrue(set.isFull());
	}

	@Test
	public void testCapacity() {
		set.add("0");
		set.add("1");
		set.add("2");
		set.add("3");

		Assert.assertEquals(3, set.asList().size());
	}

	@Test
	public void testLast() {
		set.add("0");
		set.add("1");
		set.add("2");

		Assert.assertEquals("2", set.last());

		set.add("3");

		Assert.assertEquals("2", set.last());
	}
}
