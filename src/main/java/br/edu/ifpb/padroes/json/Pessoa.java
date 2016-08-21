package br.edu.ifpb.padroes.json;

/**
 * Created by diogomoreira on 20/08/16.
 */
public class Pessoa {

    private int id;
    private IEndereco endereco;
    private String nome;
    private String cpf;

    public Pessoa() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IEndereco getEndereco() {
        return endereco;
    }

    public void setEndereco(IEndereco endereco) {
        this.endereco = endereco;
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
}
