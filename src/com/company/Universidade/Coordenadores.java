package com.company.Universidade;

import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios {

//Atributos

    private List<Professores> professoresSupervisionados = new ArrayList<>();

//Método construtores

    public Coordenadores() {

    }

    public Coordenadores(String nome, String CPF, int nRegistro, String orgaoLotacao, double salario, String professoresSupervisionados) {
        super(nome, CPF, nRegistro, orgaoLotacao, salario);
    }


    public void adicionarProfessoresSupervisionados(Professores professor){
        professoresSupervisionados.add(professor);
    }
    //Método aumentar salário


    public void aumentarSalario() {
        double novoSalario = (0.05 * getSalario() + getSalario());
        setSalario(novoSalario);
    }

    //Método Adiciona Professor

    //Método toString

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("Nome " + getNome());
        retorno.append("CPF " + getCPF());
        retorno.append("Número de registro " + getnRegistro());
        retorno.append("Orgão de lotacão " + getOrgaoLotacao());
        retorno.append("Salário " + getSalario());
        retorno.append("Professores supervisionados " + professoresSupervisionados);
        return retorno.toString();
    }
}
