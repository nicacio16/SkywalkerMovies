
package modelo;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idAdministrador;
    @Column(nullable = false)
    private String nome;
    @Column(unique = true, nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String login;
    @Column(nullable = false)
    private String senha;

    public long getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(long idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
