package cadenas;

import java.util.Scanner;

public class vocales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("escribeme letras");
		Scanner esc = new Scanner(System.in);
		String a ="";
		a=esc.nextLine();
		System.out.println(a);
		
		int contador = 0 ; 
		
		for(int i =0;i<a.length();i++) {
			
			
			if(a.charAt(i)=='a'|| a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				contador++;
				System.out.println("vocal encontrada: "+ a.charAt(i));
			}
			
		}
		System.out.println("tienes :" + contador + " vocales en la cadena");
	}

}
