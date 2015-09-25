package com.teaching.activities;

public class Nodo {
	private String nombre;
	private Nodo siguiente;
	
	
	public Nodo(){
		this.nombre = "";
		this.siguiente = null;
	}
	
	public Nodo(String nombre){
		this.nombre = nombre;
		this.siguiente = null;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public Nodo getSiguiente(){
		return siguiente;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setSiguiente(Nodo siguiente){
		this.siguiente = siguiente;
	}
}
