/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiroprograma.model;

/**
 *
 * @author Rodrigo
 */
public class Cliente {
    
    private String nome;
    private String sobreNome;
    private String cpf;
    private String telefone;
    private String endereco;

    public Cliente() {
    }

    public Cliente(String nome, String sobreNome, String cpf, String telefone, String endereco) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    
    
    

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobreNome
     */
    public String getSobreNome() {
        return sobreNome;
    }

    /**
     * @param sobreNome the sobreNome to set
     */
    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    
    
    
    
    
    
    
    
}
