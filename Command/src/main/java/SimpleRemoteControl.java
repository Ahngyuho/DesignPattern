public class SimpleRemoteControl {
    private final static int ButtonNumber = 7;
    Command undoCommand;
    Command[] onCommands;
    Command[] offCommands;

    public SimpleRemoteControl(){
        onCommands = new Command[ButtonNumber];
        offCommands = new Command[ButtonNumber];
        Command noCommand = new NoCommand();
        for (int i = 0; i < ButtonNumber; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }
    //Invoker
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    public void on(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    public void off(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoPushed() {
        undoCommand.undo();
    }
}
