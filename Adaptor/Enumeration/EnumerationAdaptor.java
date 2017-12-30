import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdaptor<E> implements Iterator<Object> {
	Enumeration<E> enumeration;

	public EnumerationAdaptor(Enumeration<E> enumeration) {
		this.enumeration = enumeration;
	}

	public E next() {
		return enumeration.nextElement();
	}

	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}