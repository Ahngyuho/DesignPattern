
public interface Command {
    //커맨드 객체는 모두 같은 인터페이스를 구현해야 합니다.
    //orderUp에 해당되는 메서드 입니다.
    public void execute();

    public void undo();
}
