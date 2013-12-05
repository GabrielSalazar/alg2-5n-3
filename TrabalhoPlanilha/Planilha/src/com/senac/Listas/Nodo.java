package com.senac.Listas;

public class Nodo {
	private Nodo proxima;
	private Object elemento;
	private Nodo anterior;

	public Nodo(Nodo proxima, Object elemento) {
		this.proxima = proxima;
		this.elemento = elemento;
	}

	public Nodo(Object elemento) {
		this.elemento = elemento;
	}

	public void setProxima(Nodo proxima) {
		this.proxima = proxima;
	}

	public Nodo getProxima() {
		return proxima;
	}

	public Object getElemento() {
		return elemento;
	}
	public Nodo getAnterior() {
	    return anterior;
	  }
	  
	  public void setAnterior(Nodo anterior) {
	    this.anterior = anterior;
	  }
	  
	
}

