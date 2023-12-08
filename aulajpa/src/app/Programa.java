package app;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Jorge da Silva", "jorge@email.com");
		Pessoa p2 = new Pessoa(2, "Maria Do Carmo", "maria@email.com");
		Pessoa p3 = new Pessoa(3, "Joaquim Botelho Pinto", "botelhopinto@email.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
