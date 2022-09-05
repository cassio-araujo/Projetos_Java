/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cassio
 */

public class Castelo {

	int poderDeDefesa;
	int vida;

	Castelo (int poderDeDefesa, int vida){
		this.poderDeDefesa = poderDeDefesa;
		this.vida = vida;
	}
	
	boolean receberAtaque(int ataque) {
		this.vida -= ataque;
		return true;
	}
	
}

