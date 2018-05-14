package br.com.senaigo.mobile.os2.model;

public class LoginModel {
    protected String user;
    protected String senha;

    public LoginModel(final String user,
                      final String senha) {
        this.user = user;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "user='" + user + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
