import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;

public class IteratorEnumerationAdaptor implements Enumeration<Object> {
    private Iterator<?> iterator;

    public IteratorEnumerationAdaptor(Iterator<?> iterator) {
        this.iterator = iterator;
    }
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
