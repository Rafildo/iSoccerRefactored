package Command;

import Builders.Recurso;
import Singleton.Singleton;

import static Builders.Recurso.*;

public class Onibus_Command implements Command {

    Recurso onibus;
    Singleton resources = Singleton.getInstance();

    public Onibus_Command(Recurso onibus)
    {
        this.onibus = onibus;
    }

    @Override
    public void execute()
    {
        resources.addResources(this.onibus);
    }
}
