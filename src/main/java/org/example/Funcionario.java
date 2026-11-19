package org.example;

public class Funcionario implements Cloneable {
    private int id;
    private String nome;
    private Cargo cargo;
    private String filial;

    public Funcionario(int id, String nome, Cargo cargo, String filial) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.filial = filial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public String getFilial() {
        return filial;
    }

    public void setFilial(String filial) {
        this.filial = filial;
    }

    @Override
    public Funcionario clone() throws CloneNotSupportedException {
        Funcionario funcionarioClone = (Funcionario) super.clone();
        funcionarioClone.cargo = (Cargo) funcionarioClone.cargo.clone();
        return funcionarioClone;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", filial='" + filial + '\'' +
                '}';
    }
}