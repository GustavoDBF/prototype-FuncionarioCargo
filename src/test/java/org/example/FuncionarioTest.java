package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Funcionario funcionario = new Funcionario(1, "Funcionario Original", new Cargo("Desenvolvedor", 5000.0), "São Paulo");

        Funcionario funcionarioClone = funcionario.clone();
        funcionarioClone.setId(2);
        funcionarioClone.setNome("Funcionario Clonado");
        funcionarioClone.getCargo().setSalarioBase(6500.0);

        assertEquals("Funcionario{id=1, nome='Funcionario Original', cargo=Cargo{nome='Desenvolvedor', salarioBase=5000.0}, filial='São Paulo'}", funcionario.toString());

        assertEquals("Funcionario{id=2, nome='Funcionario Clonado', cargo=Cargo{nome='Desenvolvedor', salarioBase=6500.0}, filial='São Paulo'}", funcionarioClone.toString());
    }
}