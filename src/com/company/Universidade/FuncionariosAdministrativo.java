package com.company.Universidade;

public class FuncionariosAdministrativo extends Funcionarios {

    //Atributos

    private String FuncaoAdminitrativa;
    private String Senioridade;

    //Métodos Construtores

    public FuncionariosAdministrativo() {

    }

    public FuncionariosAdministrativo(String funcaoAdminitrativa, String senioridade) {
        FuncaoAdminitrativa = funcaoAdminitrativa;
        Senioridade = senioridade;
    }

    public FuncionariosAdministrativo(String nome, int CPF, int nRegistro, String orgaoLotacao, double salario, String funcaoAdminitrativa, String senioridade) {
        super(nome, CPF, nRegistro, orgaoLotacao, salario);
        FuncaoAdminitrativa = funcaoAdminitrativa;
        Senioridade = senioridade;
    }

    //Métodos Getters e Setters


    public String getFuncaoAdminitrativa() {
        return FuncaoAdminitrativa;
    }

    public void setFuncaoAdminitrativa(String funcaoAdminitrativa) {
        FuncaoAdminitrativa = funcaoAdminitrativa;
    }

    public String getSenioridade() {
        return Senioridade;
    }

    public void setSenioridade(String senioridade) {
        Senioridade = senioridade;
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
        retorno.append("Função Admiministrativa " + FuncaoAdminitrativa);
        retorno.append("Senioridade" + Senioridade);
        return retorno.toString();
    }
}
