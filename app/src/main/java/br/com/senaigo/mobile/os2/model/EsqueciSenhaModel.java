package br.com.senaigo.mobile.os2.model;

public class EsqueciSenhaModel {
    protected String email;

    public EsqueciSenhaModel(final String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EsqueciSenhaModel{" +
                "email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
