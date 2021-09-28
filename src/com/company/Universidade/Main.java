package com.company.Universidade;

public class Main {

    public static void main(String[] args) {

        //Criando novos professores

        Professores professores = new Professores("Bárbara", "\t 08828031743", 3453, "\t Tecnologia e Ciências", 10000, "\t Graduação", "\t Ciências", 20, 2);
        Professores professores1 = new Professores("Matheus", "\t 08828037829", 3463, "\t Tecnologia e Ciências", 10000, "\t Graduação", "\t Física", 40, 3);
        Professores professores2 = new Professores("Rafael", "0882803933", 3458, "Tecnologia e Ciências", 10000, "Graduação", "Remast", 80, 2);
        Professores professores3 = new Professores("Tadeu", "0882808292043", 3459, "Tecnologia e Ciências", 10000, "Graduação", "Física III", 45, 3);

        //Criando novos coordenadores

        Coordenadores coordenadores = new Coordenadores("Philips","82020333839",736738,"83733",15000,"Franco");

        //Criando novo FuncionárioAdministrativo

        FuncionariosAdministrativo funcionariosAdministrativo = new FuncionariosAdministrativo("Angelica", "08828082943", 349, "Tecnologia e Ciências", 10000, "Tesoureiro","Mestrado");


        //Apresentando Professor

        professores.aumentarSal();
        System.out.println(professores);
        professores.getQuantidadeDeAluno();
        System.out.println(professores);

        //Apresentando Coordenador  e aumento de salário

        coordenadores.aumentarSal();
        System.out.println(coordenadores);

        //Apresentando Funcionário Adm  e aumento de salário

        funcionariosAdministrativo.aumentarSal();
        System.out.println(funcionariosAdministrativo);




    }
}