package Controladores;

import Builders.Recurso;
import Command.AddResource;
import Command.Centro_Treinamento_Command;
import Command.Estadio_Command;
import Command.Onibus_Command;
import Utilitarios.Tratamento_erro;

import java.util.Scanner;

public class Recurso_Controlador {



    public void selectResource()
    {
        AddResource addResource = new AddResource();
        String name;
        String available;
        Scanner input = new Scanner(System.in);
        System.out.println("1: Transporte");
        System.out.println("2: Centro de treinamento");
        System.out.println("3: Estádio");
        System.out.println("4: Voltar");
        int choice = Tratamento_erro.checkInt();
        switch (choice) {
            case 1:
                System.out.println("Nome/Código do recurso:");
                name = input.nextLine();
                System.out.println("Disponível (Sim ou Não):");
                available = input.nextLine();
                Recurso onibus = new Recurso.RecursoBuilder("Ônibus",name,FormatConversion(available)).build();
                Onibus_Command oc = new Onibus_Command(onibus);
                addResource.setCommand(oc);
                break;

            case 2:
                System.out.println("Nome/Código do recurso:");
                name = input.nextLine();
                System.out.println("Disponível (Sim ou Não):");
                available = input.nextLine();
                System.out.println("Dormitórios:");
                int dormitories = input.nextInt();
                Recurso centro_treinamento = new Recurso.RecursoBuilder("Centro de treinamento",name,
                        FormatConversion(available))
                        .setDormitories(dormitories)
                        .build();
                Centro_Treinamento_Command ctc = new Centro_Treinamento_Command(centro_treinamento);
                addResource.setCommand(ctc);
                break;

            case 3:
                System.out.println("Nome/Código do recurso:");
                name = input.nextLine();
                System.out.println("Disponível (Sim ou Não):");
                available = input.nextLine();
                System.out.println("Número de torcedores:");
                int cheerers = input.nextInt();
                System.out.println("Número de banheiros:");
                int toilets = input.nextInt();
                System.out.println("Número de lanchonetes:");
                int snackbars = input.nextInt();
                Recurso estadio = new Recurso.RecursoBuilder("Estádio",name,FormatConversion(available))
                        .setCheerers(cheerers)
                        .setToilets(toilets)
                        .setSnackbars(snackbars)
                        .build();
                Estadio_Command ec = new Estadio_Command(estadio);
                addResource.setCommand(ec);
                break;
        }
        addResource.buttonWasPressed();
    }


    public boolean FormatConversion(String available)
    {
        if (available.equals("Sim"))
        {
            return true;
        }
        else if (available.equals("Não"))
        {
            return false;
        }
        else
        {
            return false;
        }
    }
}
