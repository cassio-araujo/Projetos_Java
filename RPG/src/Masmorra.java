/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cassio
 */
public class Masmorra {

    String nome;
    String nivelDeDificuldade;
    int ouroASerEncontrado;

    Masmorra(String nome, String nivelDeDificuldade, int ouroASerEncontrado) {
        this.nome = nome;
        this.nivelDeDificuldade = nivelDeDificuldade;
        this.ouroASerEncontrado = ouroASerEncontrado;
    }

    void relatorio() {
        System.out.println("Nome: " + nome);
        System.out.println("Nivel de Dificuldade: " + nivelDeDificuldade);
        System.out.println("Ouro a ser encontrado" + ouroASerEncontrado);
        return;
    }

}
