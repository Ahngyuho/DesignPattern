import java.util.Collection;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

public class EnumerationIteratorAdaptor implements Iterator<Object> {
    Enumeration<?> enumeration;

    public EnumerationIteratorAdaptor(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public Object next() {
        return enumeration.nextElement();
    }
}
