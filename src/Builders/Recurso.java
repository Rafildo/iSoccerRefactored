package Builders;

import java.util.ArrayList;

public class Recurso {
    private String type;
    private String name;
    private int dormitories;
    private boolean availability;
    private int cheerers;
    private int toilets;
    private int snackbars;
    public static ArrayList<Recurso> resources = new ArrayList<>();

    private Recurso(RecursoBuilder builder)
    {
        this.type = builder.type;
        this.name = builder.name;
        this.dormitories = builder.dormitories;
        this.availability = builder.availability;
        this.cheerers = builder.cheerers;
        this.toilets = builder.toilets;
        this.snackbars = builder.snackbars;
    }

    public String printRecurso(Recurso recurso)
    {
        if (recurso.getType().equals("Ônibus"))
        {
            return ("Código do Ônibus: " + this.getName() + System.lineSeparator() +
                    "Disponiblidade: " + this.isAvailability() + System.lineSeparator());
        }
        else if(recurso.getType().equals("Centro de treinamento"))
        {
            return("Nome do centro: " + this.getName() + System.lineSeparator() +
                    "Número de dormitórios: " + this.getDormitories() + System.lineSeparator() +
                    "Disponibilidade: " + this.isAvailability());
        }
        else
        {
            return("Nome do estádio: " + this.getName() + System.lineSeparator() +
                    "Número de torcedores: " + this.getCheerers() + System.lineSeparator() +
                    "Lanchonetes: " + this.getSnackbars() + System.lineSeparator() +
                    "Banheiros: " + this.getToilets() + System.lineSeparator() +
                    "Disponibilidade: " + this.isAvailability() + System.lineSeparator());
        }
    }

    public String toString(Recurso recurso)
    {
        return printRecurso(recurso);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDormitories() {
        return dormitories;
    }

    public void setDormitories(int dormitories) {
        this.dormitories = dormitories;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getCheerers() {
        return cheerers;
    }

    public void setCheerers(int cheerers) {
        this.cheerers = cheerers;
    }

    public int getToilets() {
        return toilets;
    }

    public void setToilets(int toilets) {
        this.toilets = toilets;
    }

    public int getSnackbars() {
        return snackbars;
    }

    public void setSnackbars(int snackbars) {
        this.snackbars = snackbars;
    }

    public static class RecursoBuilder
    {
        private String type;
        private String name;
        private int dormitories;
        private boolean availability;
        private int cheerers;
        private int toilets;
        private int snackbars;

        public RecursoBuilder(String type, String name, boolean availability)
        {
            this.type = type;
            this.name = name;
            this.availability = availability;
        }

        public RecursoBuilder setDormitories(int dormitories)
        {
            this.dormitories = dormitories;
            return this;
        }

        public RecursoBuilder setCheerers(int cheerers)
        {
            this.cheerers = cheerers;
            return this;
        }

        public RecursoBuilder setToilets(int toilets)
        {
            this.toilets = toilets;
            return this;
        }

        public RecursoBuilder setSnackbars(int snackbars)
        {
            this.snackbars = snackbars;
            return this;
        }

        public Recurso build()
        {
            return new Recurso(this);
        }
    }

}


