package com.company.Universidade;

public abstract class Funcionarios {

    //Atributos

    private String nome;
    private String CPF;
    private int nRegistro;
    private String orgaoLotacao;
    private double salario = 10000;

    //Métodos construtores

    public Funcionarios() {

    }

    public Funcionarios(String nome, String CPF, int nRegistro, String orgaoLotacao, double salario) {
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
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


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
       retorno.append("\n Nome" + nome);
       retorno.append("\n CPF"+CPF);
       retorno.append("\n Número de registro "+ nRegistro);
       retorno.append("\n Orgão de lotação: "+orgaoLotacao);
       retorno.append("\n Salário"+salario);
        return retorno.toString();
    }
}
