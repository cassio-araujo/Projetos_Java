/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cassio
 */
public class Ala {
  int id;
  String especialidade;
  Quarto quarto;

  Ala (int id_ala, String especil, Quarto quart){
    id = id_ala;
    especialidade = especil;
    quarto = quart;
    
  }
  
  void exibirRelatorio(){
    
    System.out.println("\nid:" + id + "\nespecialidade:" + especialidade + "\ntem vaga:");
    quarto.verificarQuartoVazio();
  }
}