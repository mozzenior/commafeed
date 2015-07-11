package com.commafeed.backend;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * List wrapper that ensure a maximum capacity.
 * 
 * 
 */
public class FixedSizeSet<E> {

	private List<E> inner;

	private final int capacity;

	public FixedSizeSet(int capacity) {
		this.inner = new ArrayList<E>(Math.max(0, capacity));
		this.capacity = capacity < 0 ? Integer.MAX_VALUE : capacity;
	}

	public void add(E e) {
		if (!isFull()) {
			inner.add(e);
		}
	}

	public E last() {
		return inner.get(inner.size() - 1);
	}

	public boolean isFull() {
		return inner.size() == capacity;
	}

	public List<E> asList() {
		return inner;
	}
}
