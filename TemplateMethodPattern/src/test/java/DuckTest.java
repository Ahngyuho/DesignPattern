import org.junit.jupiter.api.Test;
import java.util.*;
class DuckTest {
    @Test
    void test() {
        Duck[] ducks = {
                new Duck("A",8),
                new Duck("A",10),
                new Duck("A",98),
                new Duck("A",47),
                new Duck("A",39),
                new Duck("A",23),
                new Duck("A",79),
        };

        Arrays.sort(ducks);
        for(Duck d : ducks){
            System.out.println(d);
        }
    }
}