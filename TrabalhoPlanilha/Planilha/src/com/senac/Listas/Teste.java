package com.senac.Listas;
import java.util.Iterator;  

public abstract class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lista lista = new Lista();
        lista.adicionaNoComeco("Primeiro");    
        lista.adicionaNoComeco("Segundo");  
        lista.adicionaNoComeco("Terceiro");  
        lista.adicionaNoComeco("Quarto");  
        lista.tamanho();   
        System.out.println("Exbir a lista.\n"+lista.toString());		
	}

}
