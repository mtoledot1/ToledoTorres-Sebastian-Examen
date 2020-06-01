package ec.edu.ups.test;

import ec.edu.ups.controlador.ControladorElectrodomestico;
import ec.edu.ups.dao.ElectrodomesticoDAO;
import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.vista.VistaElectrodomestico;

public class Principal {
    public static void main(String[] args) {
	Principal principal = new Principal();
    }
    
    private VistaElectrodomestico vista;
    private IElectrodomesticoDAO dao;
    private Electrodomestico modelo;
    private ControladorElectrodomestico controlador;
    
    public Principal(){
	vista = new VistaElectrodomestico();
	modelo = new Electrodomestico();
	dao = new ElectrodomesticoDAO();
	controlador = new ControladorElectrodomestico(vista, modelo, dao);
	System.out.println("Televisor 1");
	controlador.registrarTelevision();
	System.out.println("Televisor 2");
	controlador.registrarTelevision();
	System.out.println("Televisor 3");
	controlador.registrarTelevision();
	System.out.println("Lavadora 1");
	controlador.registrarLavadora();
	System.out.println("Lavadora 2");
	controlador.registrarLavadora();
	System.out.println("Lavadora 3");
	controlador.registrarLavadora();
	System.out.println("\nTelevisores: ");
	controlador.verTelevisiones();
	System.out.println("\nLavadoras: ");
	controlador.verLavadoras();
    }
    
}
