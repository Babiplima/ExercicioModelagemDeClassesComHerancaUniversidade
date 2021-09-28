package com.company.Universidade;

public class Professores extends Funcionarios {

    //Atributos

    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int quantidadeDeAluno;
    private int quantidadeDeTurmas;
    private double salario=10000;

    //Métodos construtores

    public Professores() {

    }

    public Professores(String nome, String CPF, int nRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada, int quantidadeDeAluno, int quantidadeDeTurmas) {
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

    //Método aumentar salário

    @Override
    public void aumentarSal(){
        double novoSalario = (0.1*salario+salario);
        this.salario=novoSalario;
    }

    //Método adicionar turma para professores

    public void setQuantidadeDeTurmas(int quantidadeDeTurmas) {
        this.quantidadeDeTurmas = quantidadeDeTurmas;
    }


    //Método ToString

    @Override

    public String toString() {
    StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome "+ getNome());
        retorno.append("\n CPF " + getCPF());
        retorno.append("\n Número de registro "+ getnRegistro());
        retorno.append("\n Orgão de lotacão " + getOrgaoLotacao());
        retorno.append("\n Salário " + getSalario());
        retorno.append("\n Nível de gradução " + nivelGraduacao);
        retorno.append("\n Disciplina ministrada " + disciplinaMinistrada);
        retorno.append("\n Quantidade de Alunos "+ quantidadeDeAluno);
        retorno.append("\n Quantidade de Turmas "+ quantidadeDeTurmas);
        return retorno.toString();
   }
}

