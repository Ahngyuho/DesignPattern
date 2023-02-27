import org.junit.jupiter.api.Test;
class SimpleRemoteControlTest {
    @Test
    public void simpleRemoteTest() {
        SimpleRemoteControl src = new SimpleRemoteControl();
        Light light = new Light();
        Command lightOn = new LightOnCommand(light); //실제 작업을 처리하는 객체를 Command 객체에 넣어줌
        Command lightOff = new LightOffCommand(new Light());
        Command garageCommand = new GarageDoorOpenCommand(new GarageDoor());
        //이렇게 인스턴스를 직접 생성해서 넣어줄 수도 있지만
        src.setCommand(1, lightOn, lightOff);
        //Command 의 추상 메소드가 딱 하나뿐인 경우 execute() 하나 뿐임!
        //그래서 이렇게 람다식을 이용해 구현할 수 있는 것임 하나 더 추가되면 할 수 없음
        //src.setCommand(1, light::on, light::off); //인보커?
        src.on(1);   //Command.execute() 가 캡슐화 되어 있음 작업 처리가 캡슐화 되어 있는 함수
        src.off(1);
//        src.setCommand(0,garageCommand,);
//        src.on();
    }
}