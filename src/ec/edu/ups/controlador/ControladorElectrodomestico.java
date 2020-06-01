package ec.edu.ups.controlador;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import ec.edu.ups.vista.VistaElectrodomestico;
import java.util.ArrayList;

public class ControladorElectrodomestico {
    private VistaElectrodomestico vista;
    private Electrodomestico modelo;
    private IElectrodomesticoDAO dao;

    public ControladorElectrodomestico(VistaElectrodomestico vista, Electrodomestico modelo, IElectrodomesticoDAO dao) {
	this.vista = vista;
	this.modelo = modelo;
	this.dao = dao;
    }
    
    public void registrarTelevision(){
	modelo = vista.ingresarTelevision();
	dao.crearTelevision((Television)modelo);
    }
    
    public void registrarLavadora(){
	modelo = vista.ingresarLavadora();
	dao.crearLavadora((Lavadora)modelo);
    }
    
    public void verTelevisiones(){
	ArrayList<Television> televisiones = new ArrayList<>(dao.listarTelevision());
	vista.mostrarTelevisiones(televisiones);
    }
    
    public void verLavadoras(){
	ArrayList<Lavadora> lavadoras = new ArrayList<>(dao.listarLavadora());
	vista.mostrarLavadoras(lavadoras);
    }
}
