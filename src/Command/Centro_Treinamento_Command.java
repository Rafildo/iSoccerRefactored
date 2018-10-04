package Command;

import Builders.Recurso;
import Singleton.Singleton;

import static Builders.Recurso.*;


public class Centro_Treinamento_Command implements Command {

   Recurso centro_treinamento;
   Singleton resources = Singleton.getInstance();

    public Centro_Treinamento_Command(Recurso centro_treinamento)
    {
       this.centro_treinamento = centro_treinamento;
    }

    @Override
    public void execute()
    {
        resources.addResources(this.centro_treinamento);
    }
}
