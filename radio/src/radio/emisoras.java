package radio;

import java.util.Scanner;

public class emisoras {
    double frecuenciaA=81.0;
    
    public void subirVolumen() {
    	if(frecuenciaA>179.5) {
    		frecuenciaA=80.0;
    		System.out.println("su frecuencia actual "+frecuenciaA+"\n");
    	}
    	else {
    		frecuenciaA+=0.5;
    		System.out.println("su frecuencia actual "+frecuenciaA+"\n");
    		
    	}
    	menu();
    }
    public void bajarVolumen() {
    	if(frecuenciaA<80.5) {
    		frecuenciaA=180.0;
    		System.out.println("su frecuencia actual "+frecuenciaA+"\n");
    	}
    	else if(frecuenciaA>80){
    		frecuenciaA-=0.5;
    		System.out.println("su frecuencia actual "+frecuenciaA+"\n");
    	}
    	menu();
    }
    public void menu() {
		System.out.println("Que desea hacer");
		System.out.println("1.subir volumen");
		System.out.println("2.bajar volumen");
		System.out.println("3.mostrar la frecuencia");
		
		System.out.println("DIGITE OPCION:");
		Scanner entrada = new Scanner(System.in);
		int opcion=entrada.nextInt();
		switch (opcion) {
		case 1:subirVolumen();;break;
		case 2:bajarVolumen();;break;
		
		
		
		}
		
	}
    

	public static void main(String[] args) {
		emisoras em=new emisoras();
		System.out.println(em);
		em.menu();

	}

}
