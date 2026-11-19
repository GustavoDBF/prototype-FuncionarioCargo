package org.example;

public class Cargo implements Cloneable {
    private String nome;
    private Double salarioBase;

    public Cargo(String nome, Double salarioBase) {
        super();
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }
}