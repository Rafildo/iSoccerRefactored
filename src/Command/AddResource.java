package Command;

public class AddResource {
    Command slot;

    public AddResource(){}

    public void setCommand(Command command)
    {
        slot = command;
    }

    public void buttonWasPressed()
    {
        slot.execute();
    }
}
