package com.company.Universidade;

public class Funcionarios {

    //Atributos

    private String nome;
    private int CPF;
    private int nRegistro;
    private String orgaoLotacao;
    private double salario;

    //Métodos construtores

    public Funcionarios() {

    }

    public Funcionarios(String nome, int CPF, int nRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.nRegistro = nRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    //Métodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getnRegistro() {
        return nRegistro;
    }

    public void setnRegistro(int nRegistro) {
        this.nRegistro = nRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Método aumentar salário

    public void aumentarSal(){
        double novoSalario = (0.1*salario+salario);
        this.salario=novoSalario;
    }

    //Método toString


    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append( "Nome "+ nome);
        retorno.append("CPF " + CPF);
        retorno.append("Número de registro "+ nRegistro);
        retorno.append("Orgão de lotacão " + orgaoLotacao);
        retorno.append( "Salário " + salario);
        return retorno.toString();
    }

}
