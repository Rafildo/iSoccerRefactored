package Singleton;

import Builders.Funcionario;
import Builders.Recurso;

import java.util.ArrayList;

public class Singleton {

    private static Singleton single_instance = null;

    public ArrayList<Funcionario> employees;
    public ArrayList<Recurso> resources;

    private Singleton()
    {
       employees = new ArrayList<>();
       resources = new ArrayList<>();
    }

    public static Singleton getInstance()
    {
        if (single_instance == null)
        {
            single_instance = new Singleton();
        }
        return single_instance;
    }

    public ArrayList<Funcionario> getEmployees()
    {
        return this.employees;
    }

    public ArrayList<Recurso> getResources()
    {
        return this.resources;
    }

    public void addEmployees(Funcionario funcionario)
    {
        employees.add(funcionario);
    }

    public void addResources(Recurso recurso)
    {
        resources.add(recurso);
    }
}
