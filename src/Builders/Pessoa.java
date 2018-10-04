package Builders;

public class Pessoa {
    private String name;
    private String email;
    private String cpf;
    private String phone;
    private String type;

    private Pessoa(PessoaBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.cpf = builder.cpf;
        this.phone = builder.phone;
        this.type = builder.type;
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

    public static class PessoaBuilder {
        private String name;
        private String email;
        private String cpf;
        private String phone;
        private String type;

        public PessoaBuilder(String name, String email, String cpf, String phone, String type) {
            this.name = name;
            this.email = email;
            this.cpf = cpf;
            this.phone = phone;
            this.type = type;
        }

        public Pessoa build()
        {
            return new Pessoa(this);
        }
    }
}

