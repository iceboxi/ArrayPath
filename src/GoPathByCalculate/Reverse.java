package GoPathByCalculate;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Reverse<T> implements Iterable<T> {
	private final List<T> original;

    public Reverse(List<T> original) {
        this.original = original;
    }
    
	@Override
	public Iterator<T> iterator() {
		final ListIterator<T> i = original.listIterator(original.size());

        return new Iterator<T>() {
            public boolean hasNext() { return i.hasPrevious(); }
            public T next() { return i.previous(); }
            public void remove() { i.remove(); }
        };
	}

	public static <T> Reverse<T> reversed(List<T> original) {
        return new Reverse<T>(original);
    }
}
