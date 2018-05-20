import java.util.Iterator;
import java.util.NoSuchElementException;

public class ElementIterator<E> implements Iterator<E> {
	@SuppressWarnings("rawtypes")
	private ArrayBasedStack theArray; // ArrayList<Vector> will be set here

	@SuppressWarnings("rawtypes")
	public ElementIterator(ArrayBasedStack theArray) {
		this.theArray = theArray;
	}

	@Override
	public boolean hasNext() {
		return !theArray.isEmpty();
	}

	@SuppressWarnings("unchecked")
	@Override
	public E next() {
		if (hasNext()) {
			return (E) theArray.pop();
		} else {
			throw new NoSuchElementException("There are no elements size = " + theArray.size());
		}
	}

}