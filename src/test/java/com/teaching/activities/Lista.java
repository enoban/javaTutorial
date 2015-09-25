package com.teaching.activities;

public class Lista {
	private int tamanio;
	private Nodo inicio;
	private Nodo ultimo;
	
	public Lista() {
		inicio = null;
		ultimo = null;
		tamanio = 0;
		}
	
	public Lista(Nodo n) {
		inicio = n;
		ultimo = n;
		tamanio = 1;
	}
	
	public void imprimir() {
		Nodo temp = inicio;
		if(temp==null) System.out.println("La lista esta vacia");
		while(temp!=null){
			System.out.println("El nombre del nodo es: " + temp.getNombre());
			temp = temp.getSiguiente();
		}
		System.out.println("El tamanio de la lista es: " + tamanio);
		
	}
	
	public int getTamanio() {
		return tamanio;
	}
	
	public Nodo getInicio() {
		return inicio;
	}
	
	public Nodo getUltimo() {
		return ultimo;
	}
	
	public void agregar(Nodo nuevo){
		if(nuevo==null) throw new NullPointerException("El nodo no puede ser nulo.");
		if(this.tamanio==0) {
			this.inicio = nuevo;
			this.ultimo = nuevo;
			this.tamanio++;
		}
		else {
			ultimo.setSiguiente(nuevo);
			tamanio++;
			ultimo = nuevo;
		}
	}
	
	public void agregar(Nodo nuevo,int indice) {
		if(nuevo==null) throw new NullPointerException("El nodo no puede ser nulo.");
		if(indice<0 || indice > tamanio) throw new IndexOutOfBoundsException("Indice invalido");
		if(this.tamanio==0) {
			agregar(nuevo);
		}
		else{
			if(indice==0){
				nuevo.setSiguiente(inicio);
				inicio = nuevo;
			}
			else{
				Nodo temp = inicio;
				for(int count=0;count<indice-1;count++){
					temp = temp.getSiguiente();
				}
				nuevo.setSiguiente(temp.getSiguiente());
				temp.setSiguiente(nuevo);	
			}
			tamanio++;
		}
	}
	
	public void agregar(Lista nuevaLista) {
		if(nuevaLista==null) throw new NullPointerException("La lista no puede ser nula.");
		if(nuevaLista.getTamanio()==0) return;
		this.ultimo.setSiguiente(nuevaLista.getInicio());
		this.ultimo = nuevaLista.getUltimo();
		this.tamanio += nuevaLista.getTamanio();
		
	}
	
	public static void main(String[] args) {
		Lista l = new Lista();
		l.imprimir();
		l.agregar(new Nodo("a"),0);
		l.imprimir();
		l.agregar(new Nodo("b"),0);
		l.imprimir();
		/*
		Lista l2 = new Lista();
		l.agregar(new Nodo("b"));
		l.agregar(new Nodo("c"));
		l.imprimir();
		l.agregar(new Nodo("d"), 0);
		l.imprimir();
		l2.agregar(new Nodo("a2"));
		l.agregar(l2);
		l.imprimir();
		*/
	}

}
