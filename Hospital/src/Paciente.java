/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cassio
 */
public class Paciente {
  String nome;
  Medico medico;
  int diasInternado;

  Medico medico1 = new Medico("Roberto");
  
  Paciente (String n, int diasInter){
    nome = n;
    diasInternado = diasInter;

  }
  
  void exibirRelatorioPac() {
    System.out.print("\nnome paciente:" + nome);
    System.out.print("\nmedico responsável:" + medico1.nome);
    System.out.print("\nDias Internado:" + diasInternado);
  }

  int retornarDiasInternado() {
   // System.out.print("Dias internado" + diasInternado);
    return diasInternado;
  }
}