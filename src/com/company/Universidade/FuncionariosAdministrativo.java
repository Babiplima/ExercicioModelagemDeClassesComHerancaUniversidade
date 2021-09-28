package com.company.Universidade;

public class FuncionariosAdministrativo extends Funcionarios {

    //Atributos

    private String FuncaoAdminitrativa;
    private String Senioridade;
    private double salario = 10000;

    //Métodos Construtores

    public FuncionariosAdministrativo() {

    }

    public FuncionariosAdministrativo(String nome, String CPF, int nRegistro, String orgaoLotacao, double salario, String funcaoAdminitrativa, String senioridade) {
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
    //Método aumentar salário

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome "+ getNome());
        retorno.append("\n CPF " + getCPF());
        retorno.append("\n Número de registro "+ getnRegistro());
        retorno.append("\n Orgão de lotacão " + getOrgaoLotacao());
        retorno.append("\n Salário " + getSalario());
        retorno.append("\n Função Administrativa " + FuncaoAdminitrativa);
        retorno.append("\n Senioridade " + Senioridade);
        retorno.append("\n Salário " + salario);
        return retorno.toString();

    }

    public void aumentarSal() {
        double novoSalario = (0.1 * salario + salario);
        this.salario = novoSalario;
        //Método toString



        }
    }

