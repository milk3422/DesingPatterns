package com.example.patterns.singleton;

/**
 * Bill Pugh's solution is known as the <b>Initialization-on-demand Holder
 * Idiom</b>. This solution is a lazy initialization solution that takes
 * advantages of Java's guarantees about class initialization.
 * <p>
 * The nested class is referenced no earlier (and therefore loaded no earlier by
 * the class loader) than the moment that {@link #getInstance()} is called.
 * Thus, this solution is thread-safe without requiring special language
 * constructs (i.e. {@code volatile} or {@code synchronized}).
 * 
 * @author Zachary Radtka
 */
public class SingletonBillPugh {

	/**
	 * A {@code private} default constructor to ensure {@code SingletonBillPugh}
	 * cannot be called by other classes.
	 */
	private SingletonBillPugh() {
	}

	/**
	 * A static inner class that is loaded on the first execution of
	 * {@link com.example.patterns.singleton.SingletonBillPugh#getInstance()
	 * SingletonBillPugh.getInstance()} or the first access to
	 * {@link com.example.patterns.singleton.SingletonBillPugh.SingletonHolder#INSTANCE
	 * SingletonHolder.INSTANCE}, but not before.
	 */
	private static class SingletonHolder {
		private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
	}

	/**
	 * Return an instance of {@code SingletonBillPugh}.
	 * 
	 * @return A reference to {@code SingletonBillPugh}
	 */
	public static SingletonBillPugh getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
