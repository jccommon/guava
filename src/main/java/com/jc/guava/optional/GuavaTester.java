package com.jc.guava.optional;

import org.junit.Test;

import com.google.common.base.Optional;

public class GuavaTester {

	//@Test
	public void guava() {

		GuavaTester guavaTester = new GuavaTester();
		Integer value1 = null;
		Integer value2 = new Integer(10);
		Optional<Integer> a = Optional.fromNullable(value1);
		Optional<Integer> b = Optional.of(value2);

		System.out.println(b.get());

		System.out.println(guavaTester.sum(a, b));

	}

	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		// Optional.isPresent - checks the value is present or not
		System.out.println("First parameter is present: " + a.isPresent());

		System.out.println("Second parameter is present: " + b.isPresent());

		// Optional.or - returns the value if present otherwise returns
		// the default value passed.
		Integer value1 = a.or(new Integer(0));

		// Optional.get - gets the value, value should be present
		Integer value2 = b.get();

		return value1 + value2;
	}

	@Test
	public void sum2() {
		Optional<Integer> a = Optional.of(1);
		Optional<Integer> b = Optional.of(2);
		if (a.isPresent() && b.isPresent()) {
			System.out.println(Optional.of(a.get() + b.get()).get());
		}
		System.out.println(Optional.absent());
		
	}

}
