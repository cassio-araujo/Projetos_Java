/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cassio
 */
public class Ouro extends Tesouro {
  
  Ouro(String tipo, float valor) {
    this.tipo = tipo;
    this.valor = valor;
  }

  public float calcularQuantidade() {
    return this.valor;
  }
}
