package view;

import controller.DivisaoController;

public class Principal {

	public static void main(String[] args) {
		DivisaoController pc = new DivisaoController();
		int a = 25;
		int b = 5;
		int resultado = pc.Divis(a, b);
		System.out.println("Resultado da operação = "+resultado);
	}
}
