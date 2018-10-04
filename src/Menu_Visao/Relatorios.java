package Menu_Visao;

import Pessoas.Funcionarios.Funcionario;
import Pessoas.Funcionarios.Jogador;
import Pessoas.Socio_Torcedor;
import Recursos.Recurso;
import Singleton.Singleton;
import Utilitarios.Tratamento_erro;

import java.util.Scanner;

public class Relatorios {
    Singleton resources = Singleton.getInstance();
    Singleton employees = Singleton.getInstance();

    public void Menu()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Relatório do time");
        System.out.println("2: Lista de jogadores aptos");
        System.out.println("3: Lista de jogadores não aptos");
        System.out.println("4: Lista de funcionários");
        System.out.println("5: Lista de recursos");
        System.out.println("6: Lista de sócios-torcedores");

        int choice = Tratamento_erro.checkInt();
        switch (choice)
        {
            case 1:
                teamReport();
                break;

            case 2:
                playerStatus(1);
                break;

            case 3:
                playerStatus(0);
                break;

            case 4:
                employeeReport();
                break;

            case 5:
                resourceReport();
                break;

            case 6:
                cheererReport();
                break;

        }

    }

    public  void teamReport()
    {
        Scanner input = new Scanner(System.in);
        if (!employees.getEmployees().isEmpty()) {
            for (int i = 0; i < employees.getEmployees().size(); i++) {
                if (employees.getEmployees().get(i).getType().equals("Treinador")) {
                    System.out.println(employees.toString());
                    break;
                } else {
                    System.out.println("Treinador não encontrado");
                    break;
                }
            }
            for (int i = 0; i < employees.getEmployees().size(); i++) {
                if (employees.getEmployees().get(i).getType().equals("Jogador")) {
                    System.out.println(employees.toString());
                } else {
                    System.out.println("Não foram encontrados jogadores");
                    break;
                }
            }
        }
        else
        {
            System.out.println("Não há funcionários");
        }
    }

    public static void playerStatus(int i)
    {
        if (!Jogador.able.isEmpty()) {
            if (i == 1) {
                for (String list : Jogador.able) {
                    System.out.println(list);
                }
            }
        }
        if (Jogador.unable.isEmpty()) {
            if (i == 0) {
                for (String list : Jogador.unable) {
                    System.out.println(list);
                }
            }
        }
        else
        {
            System.out.println("Não há jogadores");
        }
    }

    public void employeeReport()
    {
        Scanner input = new Scanner(System.in);
        if (!employees.getEmployees().isEmpty()) {
            System.out.println("Tipo de funcionário a ser listado");
            String type = input.nextLine();

            switch (type) {
                case "Médico":
                    for (int i = 0; i < employees.getEmployees().size(); i++) {
                        if (employees.getEmployees().get(i).getType().equals("Médico")) {
                            System.out.println(employees.getEmployees().get(i).toString(employees.getEmployees().get(i)));
                        } else {
                            System.out.println("Não foi encontrado médico");
                        }
                    }
                    break;

                case "Presidente":
                    for (int i = 0; i < employees.getEmployees().size(); i++) {
                        if (employees.getEmployees().get(i).getType().equals("Presidente")) {
                            System.out.println(employees.getEmployees().get(i).toString(employees.getEmployees().get(i)));
                        } else {
                            System.out.println("Não foi encontrado presidente");
                        }
                    }
                    break;

                case "Preparador Físico":
                    for (int i = 0; i < employees.getEmployees().size(); i++) {
                        if (employees.getEmployees().get(i).getType().equals("Preparador Físico")) {
                            System.out.println(employees.getEmployees().get(i).toString(employees.getEmployees().get(i)));
                        } else {
                            System.out.println("Não foram encontrados preparadores físicos");
                        }
                    }
                    break;

                case "Motorista":
                    for (int i = 0; i < employees.getEmployees().size(); i++) {
                        if (employees.getEmployees().get(i).getType().equals("Motorista")) {
                            System.out.println(employees.getEmployees().get(i).toString(employees.getEmployees().get(i)));
                        } else {
                            System.out.println("Não foram encontrados motoristas");
                        }
                    }
                    break;

                case "Cozinheiro":
                    for (int i = 0; i < employees.getEmployees().size(); i++) {
                        if (employees.getEmployees().get(i).getType().equals("Cozinheiro")) {
                            System.out.println(employees.getEmployees().get(i).toString(employees.getEmployees().get(i)));
                        } else {
                            System.out.println("Não foram encontrados cozinheiros");
                        }
                    }
                    break;

                case "Advogado":
                    for (int i = 0; i < employees.getEmployees().size(); i++) {
                        if (employees.getEmployees().get(i).getType().equals("Advogado")) {
                            System.out.println(employees.getEmployees().get(i).toString(employees.getEmployees().get(i)));
                        } else {
                            System.out.println("Não foram encontrados advogados");
                        }
                    }
                    break;
            }
        }
        else
        {
            System.out.println("Não há funcionários");
        }
    }

    public  void resourceReport()
    {
        Scanner input =  new Scanner(System.in);
        System.out.println("Escolha o recurso: (Transporte , Centro de treinamento ou Estádio)");
        String resource = input.nextLine();
        switch(resource)
        {
            case "Transporte":
                if (!resources.getResources().isEmpty()) {
                    for (int i = 0 ; i < resources.getResources().size() ; i++) {
                        if (resources.getResources().get(i).getType().equals("Ônibus"))
                        {
                            System.out.print("Ônibus:");
                            System.out.println(resources.getResources().get(i).toString(resources.getResources().get(i)));
                        }
                        else
                        {
                            System.out.println("Não foram encontrados transportes");
                        }
                    }
                }

                break;

            case "Centro de treinamento":
                if (!resources.getResources().isEmpty()) {
                    for (int i = 0 ; i < resources.getResources().size() ; i++) {
                        if (resources.getResources().get(i).getType().equals("Centro de treinamento"))
                            if (resources.getResources().get(i).isAvailability()) {
                                System.out.println("Disponível");
                            } else {
                                System.out.println("Não disponível");
                            }
                        }
                    }
               else
               {
                   System.out.println("Não foi encontrado centro de treinamento");
               }
               break;

            case "Estádio":
                if (!resources.getResources().isEmpty()) {
                    for (int i = 0 ; i < resources.getResources().size() ; i++) {
                        if (resources.getResources().get(i).getType().equals("Estádio"))
                            if (resources.getResources().get(i).isAvailability()) {
                                System.out.println("Disponível");
                            } else {
                                System.out.println("Não disponível");
                            }
                        }
                    }
                else
                {
                    System.out.println("Não foi encontrado estádio");
                }
        }

    }

    public static void cheererReport()
    {
        if (!Socio_Torcedor.cheerer.isEmpty()) {
            System.out.println("Lista de sócios-torcedores adimplentes:");
            for (String list : Socio_Torcedor.inTime) {
                System.out.println(list);
            }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lista de sócios-torcedores inadimplentes");
            for (String list : Socio_Torcedor.notInTime) {
                System.out.println(list);
            }
            System.out.println();
            System.out.print("Quantidade:");
            System.out.println(Socio_Torcedor.cheerer.size());
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lista com dados individuais");
                for (Socio_Torcedor list : Socio_Torcedor.cheerer) {
                    System.out.println(list);
                }
            } else {
                System.out.println("Não foram encontrados sócios-torcedores");
            }
        }
    }

