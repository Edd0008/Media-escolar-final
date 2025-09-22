package br.com.jandira.senai.mediaescolar;

import javax.print.attribute.standard.Media;

public class MediaEscolarApp {

    public static void main(String[] args){
        System.out.println("Preparando aplicativo.........");
        System.out.println("*************************************");
        System.out.println("  Calculador de média escolar final  ");
        System.out.println("*************************************");

        MediaEscolar mediaDosAlunos = new MediaEscolar();
        mediaDosAlunos.obterDadosDoAluno ();

    }
}
