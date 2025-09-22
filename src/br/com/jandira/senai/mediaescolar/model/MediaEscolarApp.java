package br.com.jandira.senai.mediaescolar.model;

import br.com.jandira.senai.mediaescolar.MediaEscolar;

public class MediaEscolarApp {
    
    public static void main(String[] args){
        System.out.println("Preparando aplicativo.........");
        System.out.println("*************************************");
        System.out.println("  Calculador de média escolar final  ");
        System.out.println("*************************************");

        br.com.jandira.senai.mediaescolar.MediaEscolar mediaDosAlunos = new MediaEscolar();
        mediaDosAlunos.obterDadosDoAluno ();

    }
}
