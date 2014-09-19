package com.example.patterns.singleton;

/**
 * The eager initialization singleton creates a new instance when the class is
 * initialized.
 * <p>
 * An eager initialization singleton is the right choice if the program will
 * always need an instance, or if the cost of creating the instance is not too
 * large in terms of time/resources.
 * <p>
 * Eager initialization has the following features:
 * <ul>
 * <li>An instance is not constructed until the class is used</li>
 * <li>The {@link #getInstance()} method does not need to be synchronized,
 * meaning no expensive locking is required</li>
 * <li>The {@code final} modifier means the instance cannot be redefined</li>
 * </ul>
 * 
 * @author Zachary Radtka
 */
public class SingletonEagerInitialization {

	/**
	 * A {@code static final} instance of this class.
	 * */
	private static final SingletonEagerInitialization instance = new SingletonEagerInitialization();

	/**
	 * A {@code private} default constructor to ensure
	 * {@code SingletonEagerInitialization} cannot be called by other classes.
	 */
	private SingletonEagerInitialization() {
	}

	/**
	 * Return an instance of {@code SingletonEagerInitialization}.
	 * 
	 * @return A reference to {@code SingletonEagerInitialization}
	 */
	public static SingletonEagerInitialization getInstance() {
		return instance;
	}
}
