package com.teaching.oop;

import java.util.*;

public class Thor {
    public Integer edad;
    public String superpoder;
    public String accesorios;
    public int hijos;
    public boolean esposa;
    
    public Thor(){
        
        this.edad = Integer.parseInt("100");
        edad.toString();
        int x = 10;
        String cosa = x + "";
        this.superpoder = "matar borreguitos";
        this.accesorios = "martillo";
        this.hijos = 1000;
        this.esposa = true;
        
    }
    
    public Thor(int edad, String superpoder){
        this.edad = edad;
        this.superpoder = superpoder;
        this.hijos = 500;
    }
    
    public Thor(int edad, boolean esposa){
        this.edad = edad;
        this.esposa = esposa;
    }
    
    public void volar(String accesorio) {
        String mensaje = "";
        if (accesorio.equals("martillo")) 
        {
            int cosa = 10;
            mensaje = "Giro el martillo y a volar!";
            System.out.println(mensaje);
        }
        else{
            System.out.println("Necesito mi martillo");
        }
        mensaje = "Hola";
    }
    
    public int miEdad(){
        return this.edad;
    }
    
    public static void main(String[] args){
        Thor pepe = new Thor();
        Thor pedro = new Thor();
        String objeto1 = "silla";
        String objeto2 = "martillo";
        pepe.volar(objeto1);
        pepe.volar(objeto2);
        
        System.out.println(pepe.miEdad());
        double valor1 = 10;
        int grande = (int)valor1;
        System.out.println(grande);
        
        String variable = "Hola \"amigos\"\tEste es otro mensaje";
        String escape = "Este es el caracter de escape: \\";
        System.out.println(variable);
        System.out.println(escape);
    }
}
