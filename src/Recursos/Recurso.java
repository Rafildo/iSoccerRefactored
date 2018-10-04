package Recursos;

import Singleton.Singleton;

import java.util.ArrayList;

public class Recurso {
    Singleton resources = Singleton.getInstance();
    private String type;
    private String name;
    private boolean availability;



    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailability() {
        return availability;
    }


    public Recurso(String type, String name, boolean availability)
    {
        this.type = type;
        this.name = name;
        this.availability = availability;
    }


    public String isAvailable() {
        if (isAvailability()) {
            return "Disponível";
        } else {
            return "Não disponível";
        }
    }
    public String toString()
    {
        String values = "";
        for (Builders.Recurso list : resources.getResources())
        {
            values += list.toString() + " ";
            values += "\n";
        }
        return values;
    }
}