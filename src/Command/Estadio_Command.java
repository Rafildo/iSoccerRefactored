package Command;

import Builders.Recurso;
import Singleton.Singleton;

import static Builders.Recurso.*;

public class Estadio_Command implements Command {

    Recurso estadio;
    Singleton resources = Singleton.getInstance();

    public Estadio_Command(Recurso estadio)
    {
        this.estadio = estadio;
    }

    @Override
    public void execute()
    {
        resources.addResources(this.estadio);
    }
}
