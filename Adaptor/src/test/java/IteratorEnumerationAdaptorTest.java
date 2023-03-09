import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class IteratorEnumerationAdaptorTest {
    @Test
    void UsingArrayListTest() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(i);
        Iterator<Integer> iterator = list.iterator();
        IteratorEnumerationAdaptor iter = new IteratorEnumerationAdaptor(iterator);
        while(iter.hasMoreElements()){
            System.out.print(iter.nextElement() + " ");
        }
    }
}