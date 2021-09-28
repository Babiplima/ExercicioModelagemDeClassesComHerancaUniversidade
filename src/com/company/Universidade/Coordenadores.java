package com.company.Universidade;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {

//Atributos

    private List<Professores> professoresSupervisionados = new ArrayList<>();
    private double salario = 10000;


//Método construtores

    public Coordenadores() {

    }

    public Coordenadores(String nome, String CPF, int nRegistro, String orgaoLotacao, double salario, String professoresSupervisionados) {
        super(nome, CPF, nRegistro, orgaoLotacao, salario);
    }


    public void adicionarProfessoresSupervisionados(Professores professor) {
        professoresSupervisionados.add(professor);
    }
    //Método aumentar salário
    @Override
    public void aumentarSal() {
    double novoSalario = (0.05 * getSalario() + getSalario());
        setSalario(novoSalario);
    }

    //Método Adiciona Professor

    //Método toString

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome " + getNome());
        retorno.append("\n CPF " + getCPF());
        retorno.append("\n Número de registro " + getnRegistro());
        retorno.append("\n Orgão de lotacão " + getOrgaoLotacao());
        retorno.append("\n Salário " + getSalario());
        retorno.append("\n Professores supervisionados " + professoresSupervisionados);
        return retorno.toString();
    }
}
