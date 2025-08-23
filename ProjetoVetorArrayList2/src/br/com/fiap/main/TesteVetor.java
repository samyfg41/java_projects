package br.com.fiap.main;

import br.com.fiap.beans.Aluno;

import javax.swing.*;

public class TesteVetor {

    // String
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    // int
    static Integer inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    // double
    static Double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        Aluno[] vetorAluno = new Aluno[3]; // [0] [1] [2]

        // Preparar indice para controlar/ alocar nos vetores
        int indice = 0;

        //Laço de Repetição do/while (faça/enquanto)

        do{
            // Entradas
            vetorAluno[indice] = new Aluno();
            vetorAluno[indice].setNome(texto("Nome: "));
            vetorAluno[indice].setRm(texto("RM: "));
            vetorAluno[indice].setTurma(texto("Turma: "));
            vetorAluno[indice].setIdade(inteiro("Idade: "));
            vetorAluno[indice].setNota(real("Nota: "));

            indice ++;


        } while(JOptionPane.showConfirmDialog(null, "Cadastrar mais alunos?",
                "CADASTRO DE ALUNOS",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE ) ==0 );

        // Saídas

        for(int buscar == 0
        System.out.println(


            );
        );
    }
}
