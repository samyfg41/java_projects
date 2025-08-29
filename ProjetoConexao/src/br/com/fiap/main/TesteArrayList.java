package br.com.fiap.main;

import br.com.fiap.beans.Colaborador;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayList {

    //string
    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    //int
    static Integer inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    //double
    static Double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    public static void main(String[] args) {

        ArrayList<Colaborador> listaColaboradores = new ArrayList<>();

        Colaborador objColaborador = null;

        do{
            //Entradas
            objColaborador = new Colaborador();
            objColaborador.setNome(texto("Nome: "));
            objColaborador.setCargo(texto("Cargo: "));
            objColaborador.setIdade(inteiro("Idade: "));
            objColaborador.setSalario(real("Salário: "));

            listaColaboradores.add(objColaborador);

        }while( JOptionPane.showConfirmDialog(null,
                "Deseja adicionar mais colaboradores?", "Lista de Colaboradores",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)
                ==0 );

        for( Colaborador c : listaColaboradores){
            System.out.println(
                    "\n\nNome: " + c.getNome() +
                    "\nCargo: " + c.getCargo() +
                    "\nIdade: " + c.getIdade() +
                    "\nSalário: " + c.getSalario()
            );
        }
    }
}
