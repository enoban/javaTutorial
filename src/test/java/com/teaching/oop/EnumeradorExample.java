package com.teaching.oop;

public class EnumeradorExample {
    
    enum Planetas { MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO, PLUTON}
    
    enum Posicion {PRIMERO, SEGUNDO, TERCERO}
    static String[] elegidos = new String[3];
    
    public void setNombreAlt(Posicion p, String valor){ // Do something
    }
    
    
    public static void main(String[] args) {
        System.out.println(EnumeradorExample.Planetas.MERCURIO);
        elegidos[Planetas.MERCURIO.ordinal()] = "HOLI";
    }
}
