package com.company.Universidade;

public class Coordenadores extends Funcionarios {
}
//Atributos

    private String professoresSupervisionados;

//Método construtores

    public Coordenadores() {

    }

    public Coordenadores(String nome, int CPF, int nRegistro, String orgaoLotacao, double salario, String professoresSupervisionados) {
        super(nome, CPF, nRegistro, orgaoLotacao, salario);
        this.professoresSupervisionados = professoresSupervisionados;
    }

    public String getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(String professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

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
