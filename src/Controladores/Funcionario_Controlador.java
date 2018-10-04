package Controladores;

import Pessoas.Funcionarios.*;
import Singleton.Singleton;
import Utilitarios.Tratamento_erro;
import Builders.Funcionario;

import java.util.Scanner;


public class Funcionario_Controlador  {

    Singleton employees = Singleton.getInstance();
    public void setEmployeeType()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Tipo de funcionário:");
        String type = input.nextLine();
        manageEmployeeType(type);
    }

    public void manageEmployeeType(String employeeType)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Nome:");
        String name = input.nextLine();
        System.out.println("Email:");
        String email = input.nextLine();
        System.out.println("CPF:");
        String cpf = input.nextLine();
        System.out.println("Salário:");
        Double salary = Tratamento_erro.checkDouble();
        System.out.println("Telefone:");
        String phone = input.nextLine();
        switch(employeeType)
        {
            case "Médico":
                System.out.println("CRM:");
                String crm = input.nextLine();
                Funcionario medico = new Funcionario.FuncionarioBuilder(name,email,cpf,phone,employeeType,salary,phone)
                        .setCrm(crm).build();
                employees.addEmployees(medico);
                break;

            case "Motorista":
                System.out.println("Número de habilitação");
                String licensenumber = input.nextLine();
                Funcionario motorista = new Funcionario.FuncionarioBuilder(name,email,cpf,phone,employeeType,salary,phone)
                        .setDriverId(licensenumber).build();
                employees.addEmployees(motorista);
                break;

            case "Jogador":
                Jogador_Controlador player = new Jogador_Controlador();
                Funcionario jogador = new Funcionario.FuncionarioBuilder(name,email,cpf,phone,employeeType,salary,phone)
                        .setPosition(player.checkPosition(player.setPosition()))
                        .isAvailable(player.availabilityCheck(input.nextLine())).build();
                employees.addEmployees(jogador);
                break;

            case "Presidente":
                Funcionario presidente =  new Funcionario.FuncionarioBuilder(name,email,cpf,phone,employeeType,salary,phone)
                        .build();
                employees.addEmployees(presidente);
                break;

            case "Preparador Físico":
                Funcionario preparador_fisico =  new Funcionario.FuncionarioBuilder(name,email,cpf,phone,employeeType,salary,phone)
                        .build();
                employees.addEmployees(preparador_fisico);
                break;

            case "Cozinheiro":
                Funcionario cozinheiro =  new Funcionario.FuncionarioBuilder(name,email,cpf,phone,employeeType,salary,phone)
                        .build();
                employees.addEmployees(cozinheiro);
                break;

            case "Advogado":
                Funcionario advogado =  new Funcionario.FuncionarioBuilder(name,email,cpf,phone,employeeType,salary,phone)
                        .build();
                employees.addEmployees(advogado);
                break;

            case "Treinador":
                Funcionario treinador =  new Funcionario.FuncionarioBuilder(name,email,cpf,phone,employeeType,salary,phone)
                        .build();
                employees.addEmployees(treinador);
                break;
        }
    }
}
