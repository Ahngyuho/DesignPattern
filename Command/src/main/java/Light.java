public class Light implements Receiver{
    @Override
    public void action() {
        on();
    }

    public void on() {
        System.out.println("Light ON!");
    }

    public void off() {
        System.out.println("Light OFF!");
    }
}
