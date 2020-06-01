package ec.edu.ups.vista;

import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.List;
import java.util.Scanner;

public class VistaElectrodomestico {
    private Scanner entrada;
    
    public VistaElectrodomestico(){
	entrada = new Scanner(System.in);
    }
    
    public Television ingresarTelevision(){
	System.out.print("Ingrese el codigo del televisor: ");
	int codigo = entrada.nextInt();
	Television television = new Television(codigo);
	System.out.print("Ingrese la descripcion: ");
	String descripcion = entrada.next();
	television.setDescripcion(descripcion);
	System.out.print("Ingrese el precio base: ");
	double precioBase = entrada.nextDouble();
	television.setPrecioBase(precioBase);
	System.out.print("Ingrese el color: ");
	String color = entrada.next();
	television.setColor(color);
	System.out.print("Ingrese el consumo de energía(A,B,C,D,E,F): ");
	char consumo = Character.toUpperCase(entrada.next().charAt(0));
	television.setConsumoEnergetico(consumo);
	System.out.print("Ingrese el peso: ");
	int peso = entrada.nextInt();
	television.setPeso(peso);
	System.out.print("Ingrese la resolucion en pulgadas: ");
	int resolucion = entrada.nextInt();
	television.setResolucion(resolucion);
	System.out.print("¿Psee puerto HDMI?(s/n): ");
	String hdmi = entrada.next();
	if(hdmi.equalsIgnoreCase("s"))
	    television.setPuertoHDMI(true);
	else
	    television.setPuertoHDMI(false);
	return television;
    }
    
    public Lavadora ingresarLavadora(){
	System.out.print("Ingrese el codigo de la lavadora: ");
	int codigo = entrada.nextInt();
	Lavadora lavadora = new Lavadora(codigo);
	System.out.print("Ingrese la descripcion: ");
	String descripcion = entrada.next();
	lavadora.setDescripcion(descripcion);
	System.out.print("Ingrese el precio base: ");
	double precioBase = entrada.nextDouble();
	lavadora.setPrecioBase(precioBase);
	System.out.print("Ingrese el color: ");
	String color = entrada.next();
	lavadora.setColor(color);
	System.out.print("Ingrese el consumo de energía: ");
	char consumo = Character.toUpperCase(entrada.next().charAt(0));
	lavadora.setConsumoEnergetico(consumo);
	System.out.print("Ingrese el peso: ");
	int peso = entrada.nextInt();
	lavadora.setPeso(peso);
	System.out.print("Ingrese la carga: ");
	int carga = entrada.nextInt();
	lavadora.setCarga(carga);
	return lavadora;
    }
    
    public void mostrarTelevisiones(List<Television> televisiones){
	for(Television televisor : televisiones){
	    System.out.println(televisor.toString());
	}
    }
    
    public void mostrarLavadoras(List<Lavadora> Lavadoras){
	for(Lavadora lavadora : Lavadoras){
	    System.out.println(lavadora.toString());
	}
    }
    
}
