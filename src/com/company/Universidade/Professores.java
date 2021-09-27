package com.company.Universidade;

public class Professores extends Funcionarios {

    //Atributos

    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAluno;
    private int quantidadeDeTurmas;

    //Métodos construtores

    public Professores() {

    }

    public Professores(String nome, int CPF, int nRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada, int quantidadeDeAluno, int quantidadeDeTurmas) {
        super(nome, CPF, nRegistro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.quantidadeDeAluno = quantidadeDeAluno;
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    //Métodos Getters e Setters

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQuantidadeDeAluno() {
        return quantidadeDeAluno;
    }

    public void setQuantidadeDeAluno(int quantidadeDeAluno) {
        this.quantidadeDeAluno = quantidadeDeAluno;
    }

    public int getQuantidadeDeTurmas() {
        return quantidadeDeTurmas;
    }

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }

    //Método ToString

    @Override

    public String toString() {
    StringBuilder retorno = new StringBuilder();
        retorno.append("Nome "+ getNome());
        retorno.append("CPF " + getCPF());
        retorno.append("Número de registro "+ getnRegistro());
        retorno.append("Orgão de lotacão " + getOrgaoLotacao());
        retorno.append("Salário " + getSalario());
        retorno.append("Nível de gradução " + nivelGraduacao);
        retorno.append("Disciplina ministrada " + disciplinaMinistrada);
        retorno.append("Quantidade de Alunos "+ quantidadeDeAluno);
        retorno.append("Quantidade de Turmas "+ quantidadeDeTurmas);
        return retorno.toString();
   }
}

