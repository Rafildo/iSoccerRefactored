package Builders;

import Singleton.Singleton;

import java.util.ArrayList;

public class Funcionario {
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String type;
    private Double salary;
    private String crm;
    private String driverid;
    private String position;
    private boolean available;


    private Funcionario(FuncionarioBuilder builder)
    {
        this.name = builder.name;
        this.email = builder.email;
        this.cpf = builder.cpf;
        this.phone = builder.phone;
        this.type = builder.type;
        this.salary = builder.salary;
        this.crm = builder.crm;
        this.driverid = builder.driverid;
        this.position = builder.position;
        this.available = builder.available;

    }

    public String printFuncionario(Funcionario funcionario)
    {

        if (funcionario.getType().equals("Médico"))
        {
            return ("Tipo: " + this.getType()+ System.lineSeparator() +
                    "Nome: " + this.getName() + System.lineSeparator() +
                    "Email: " + this.getEmail()+ System.lineSeparator() +
                    "CPF: " + this.getCpf()+ System.lineSeparator() +
                    "Telefone: " + this.getPhone()+ System.lineSeparator() +
                    "Salário: " + this.getSalary()+ System.lineSeparator() +
                    "CRM: " + this.getCrm()) + System.lineSeparator();
        }
        else if(funcionario.getType().equals("Motorista"))
        {
            return ("Tipo: " + this.getType()+ System.lineSeparator() +
                    "Nome: " + this.getName() + System.lineSeparator() +
                    "Email: " + this.getEmail()+ System.lineSeparator() +
                    "CPF: " + this.getCpf()+ System.lineSeparator() +
                    "Telefone: " + this.getPhone()+ System.lineSeparator() +
                    "Salário: " + this.getSalary()+ System.lineSeparator() +
                    "Número de habilitação: " + this.getDriverid()) + System.lineSeparator();
        }

        else if(funcionario.getType().equals("Jogador"))
        {
            return ("Tipo: " + this.getType()+ System.lineSeparator() +
                    "Nome: " + this.getName() + System.lineSeparator() +
                    "Email: " + this.getEmail()+ System.lineSeparator() +
                    "CPF: " + this.getCpf()+ System.lineSeparator() +
                    "Telefone: " + this.getPhone()+ System.lineSeparator() +
                    "Salário: " + this.getSalary()+ System.lineSeparator() +
                    "Posição: " + this.getPosition()) + System.lineSeparator() +
                    "Disponibilidade: " + this.isAvailable() + System.lineSeparator();
        }

        else
        {
            return ("Tipo: " + this.getType()+ System.lineSeparator() +
                    "Nome: " + this.getName() + System.lineSeparator() +
                    "Email: " + this.getEmail()+ System.lineSeparator() +
                    "CPF: " + this.getCpf()+ System.lineSeparator() +
                    "Telefone: " + this.getPhone()+ System.lineSeparator() +
                    "Salário: " + this.getSalary()+ System.lineSeparator());
        }
    }

    public String toString(Funcionario funcionario)
    {
        return printFuncionario(funcionario);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    public String getCrm() {
        return crm;
    }

    public String getDriverid()
    {
        return driverid;
    }

    public String getPosition() {
        return position;
    }

    public boolean isAvailable() {
        return available;
    }

    public static class FuncionarioBuilder
    {
        private String name;
        private String email;
        private String cpf;
        private String phone;
        private String type;
        private Double salary;
        private String crm;
        private String driverid;
        private String position;
        private boolean available;

        public FuncionarioBuilder setCrm(String crm)
        {
            this.crm = crm;
            return this;
        }

        public FuncionarioBuilder setDriverId(String driverid)
        {
            this.driverid = driverid;
            return this;
        }

        public FuncionarioBuilder setPosition(String position)
        {
            this.position = position;
            return this;
        }

        public FuncionarioBuilder isAvailable(boolean available)
        {
            this.available = available;
            return this;
        }

        public FuncionarioBuilder(String name, String email,String cpf, String phone, String type, Double salary, String employeeType)
        {
            this.name = name;
            this.email = email;
            this.cpf = cpf;
            this.phone = phone;
            this.type = type;
            this.salary = salary;
        }

        public Funcionario build()
        {
            return new Funcionario(this);
        }

    }
}
