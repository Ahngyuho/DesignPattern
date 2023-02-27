public class GarageDoor implements Receiver{
    @Override
    public void action() {
        up();
        down();
        stop();
        lightOn();
        lightOff();
    }

    public void up() {
        System.out.println("Garage Door up!");
    }
    public void down() {
        System.out.println("Garage Door down!");
    }
    public void stop() {
        System.out.println("Garage Door stop!");
    }
    public void lightOn() {
        System.out.println("Garage Door light on!");
    }
    public void lightOff() {
        System.out.println("Garage Door light off!");
    }
}
