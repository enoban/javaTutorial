package com.teaching.activities;

import com.sun.org.apache.bcel.internal.generic.FMUL;

public class Odin {
	private String name;
	private String [] alternativeNames = new String[3];
	private String wifeName;
	private String [] sons = new String[4];
	private String origin;
	private String [] familiars = new String[4];
	
	public Odin() {
		name = "Odin";
		alternativeNames[0] = "Woden";
		alternativeNames[1] = "Woden";
		alternativeNames[2] = "Wuotan";
		wifeName = "Figg";
		sons[0] = "Thor";
		sons[1] = "Baldr";
		sons[2] = "Bidarr";
		sons[3] = "Váli";
		origin = "Vallhala";
		familiars[0] = "Heimdallr";
		familiars[1] = "Gragi";
		familiars[2] = "Tyr";
		familiars[3] = "Hod";
	}
	
	public String getAbout() {
		String info = "";
		info = 
			"\t" + "Nombre: " + name + ".\n" +
			"\t" + "Nombres Alternativos: " + alternativeNames[0] + ", " + alternativeNames[1] + ", " + alternativeNames[2] + ".\n" + 
			"\t" + "Nombre de Esposa: " + wifeName + ".\n" + 
			"\t" + "Hijos: " + sons[0] + ", " + sons[1] + ", " + sons[2] + ", " + sons[3] + ".\n" + 
			"\t" + "Procedencia: " + origin + ".\n" +
			"\t" + "Conocidos: " + familiars[0] + ", " + familiars[1] + ", " + familiars[2] + ", " + familiars[3] + ".";
		return info;
	}
	
	public void setWifeName(String ) {
		wifeName = "";
	}
	
	public static void main(String[] ar) {
		Odin dios = new Odin();
		System.out.print("Acerca de Odin:\n\n" + dios.getAbout());
	}
}
