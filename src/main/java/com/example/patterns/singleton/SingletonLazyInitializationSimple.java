package com.example.patterns.singleton;

/**
 * A simpler implementation of a singleton that utilizes lazy initialization and
 * <a href="http://en.wikipedia.org/wiki/Double-checked_locking#Usage_in_Java">
 * double-checked locking</a> to create an instance of an object if one does not
 * exist. If an instance already exists, a reference to the object is returned.
 * <p>
 * The difference between this implementation and
 * {@link com.example.patterns.singleton.SingletonLazyInitialization
 * SingletonLazyInitialization} is the use of a {@code synchronized} method
 * instead of a {@code synchronized} statement.
 * <p>
 * While this implementation is simpler and cleaner than
 * {@link com.example.patterns.singleton.SingletonLazyInitialization
 * SingletonLazyInitialization} the use of a {@code synchronized} method
 * {@link #getInstance()} may lower concurrency in a heavily multithreaded
 * environment.
 * 
 * @author Zachary Radtka
 */
public class SingletonLazyInitializationSimple {

	/**
	 * A {@code static volatile} instance of this class.
	 * <p>
	 * The {@code volatile} modifier ensures atomic access of a variable
	 * */
	private static volatile SingletonLazyInitializationSimple instance = null;

	/**
	 * A {@code private} default constructor to ensure
	 * {@code SingletonLazyInitializationSimple} cannot be called by other
	 * classes.
	 */
	private SingletonLazyInitializationSimple() {
	}

	/**
	 * Return an instance of {@code SingletonLazyInitializationSimple}. If an
	 * instance does not currently exist, a new one will be created. Otherwise,
	 * a reference to the instance will be returned.
	 * 
	 * @return A reference to {@code SingletonLazyInitializationSimple}
	 */
	public static synchronized SingletonLazyInitializationSimple getInstance() {

		// Initialize the class if it has yet to be initialized
		if (instance != null) {
			instance = new SingletonLazyInitializationSimple();
		}

		return instance;
	}

}
