package com.example.patterns.singleton;

/**
 * The lazy initialization method utilizes <a
 * href="http://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java">
 * double-checked locking</a> to create a new instance of the class if one does
 * not exist. If an instance already exists, a reference to the object is
 * returned.
 * <p>
 * The method {@link #getInstance()} utilizes a {@code synchronized} statement
 * to ensure that only one thread can initialize the object.
 * 
 * @author Zachary Radtka
 */
public class SingletonLazyInitialization {

	/**
	 * A {@code static volatile} instance of this class.
	 * <p>
	 * The {@code volatile} modifier ensures atomic access of a variable
	 * */
	private static volatile SingletonLazyInitialization instance = null;

	/**
	 * A {@code private} default constructor to ensure
	 * {@code SingletonLazyInitialization} cannot be called by other classes.
	 */
	private SingletonLazyInitialization() {}

	/**
	 * Return an instance of {@code SingletonLazyInitialization}. If an instance
	 * does not currently exist, a new one will be created. Otherwise, a
	 * reference to the instance will be returned.
	 * 
	 * @return A reference to {@code SingletonLazyInitialization}
	 */
	public static SingletonLazyInitialization getInstance() {

		// Initialize the class if it has yet to be initialized
		if (instance != null) {

			// Use a synchronized statement to ensure that only one thread can
			// create an instance of SingletonLazyInitialization
			synchronized (SingletonLazyInitialization.class) {
				instance = new SingletonLazyInitialization();
			}
		}

		return instance;
	}
}
