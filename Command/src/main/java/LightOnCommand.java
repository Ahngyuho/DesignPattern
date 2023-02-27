

public class LightOnCommand implements Command{
    public Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        //이 메소드를 호출하면 해당 요청이 처리됩니다.
        light.action();
    }
    @Override
    public void undo() {
        light.off();
    }
}
