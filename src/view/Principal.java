package view;

import model.Lista;

public class Principal {
	public static void main(String[] args) {
		Lista<Integer> lista = new Lista<>();
		
		try {
			lista.addFirst(3);
			lista.addLast(5);
			lista.addLast(18);
			lista.addLast(12);
			lista.addLast(9);
			lista.addLast(7);
			lista.addLast(6);
			lista.addLast(2);
			lista.addLast(13);
			lista.addLast(4);
			lista.addLast(16);
			lista.exibirLista();
			lista.inverterLista();
			lista.exibirLista();
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	
	}
}
