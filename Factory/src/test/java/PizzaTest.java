import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PizzaTest {
    private final SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
    private final NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();

    @Test
    public void create() {
        Pizza pizza = simplePizzaFactory.createPizza("cheese");
        Assertions.assertInstanceOf(NYStyle.class,pizza);
    }

    @Test
    public void FactorySubClassCreateTest() {
        Pizza pizza = nyStylePizzaStore.createPizza("cheese");
        Assertions.assertInstanceOf(NYStyleCheesePizza.class,pizza);
    }
}
