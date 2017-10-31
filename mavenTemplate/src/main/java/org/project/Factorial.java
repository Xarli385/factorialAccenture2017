package org.project;

/**
 * 
 * @author Carlos Pérez Ferrando
 * 
 *
 */

public class Factorial {

	public long compute(long value) {
		long result;
		
		if (value < 0) {
			throw new RuntimeException("The value is negative: " + value);
		} else if ((value == 0) || (value == 1)) {
			result = 1;
		} else {
			result = value * compute(value - 1);
		}
		
		return result;
	}

}
