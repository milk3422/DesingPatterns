package com.example.patterns.singleton;

/**
 * The enum singleton model utilizes a single-element {@code enum} to implement
 * a singleton. Java guarantees that any {@code enum} value is instantiated only
 * once in a Java program and {@code enum} values are globally accessible.
 * <p>
 * The enum model is simplest model to implement, but it is somewhat inflexible.
 * 
 * @author Zachary Radtka
 */
public class SingletonEnum {

	/**
	 * An {@code enum} used to implement a singleton.
	 * 
	 * @author Zachary Radtka
	 */
	public enum Singleton {

		INSTANCE;

		/**
		 * A public method that can take any number or type of arguments.
		 * 
		 * @param value
		 *            A {@code String} to operate on
		 */
		public void execute(String value) {
			// Do stuff here
		}
	}

}
