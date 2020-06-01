package ec.edu.ups.dao;

import ec.edu.ups.idao.IElectrodomesticoDAO;
import ec.edu.ups.modelo.Electrodomestico;
import ec.edu.ups.modelo.Lavadora;
import ec.edu.ups.modelo.Television;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class ElectrodomesticoDAO implements IElectrodomesticoDAO{
    
    private SortedSet<Electrodomestico> lista;
    
    public ElectrodomesticoDAO(){
	lista = new TreeSet<>();
    }

    @Override
    public void crearTelevision(Television television) {
	lista.add(television);
    }

    @Override
    public void crearLavadora(Lavadora lavadora) {
	lista.add(lavadora);
    }

    @Override
    public List<Television> listarTelevision() {
	ArrayList<Television> teles = new ArrayList<>();
	Television t = new Television();
	for(Electrodomestico e : lista){
	    if(e.getClass() == t.getClass()){
		teles.add((Television)e);
	    }
	}
	return teles;
    }

    @Override
    public List<Lavadora> listarLavadora() {
	ArrayList<Lavadora> lava = new ArrayList<>();
	Lavadora l = new Lavadora();
	for(Electrodomestico e : lista){
	    if(e.getClass() == l.getClass()){
		lava.add((Lavadora)e);
	    }
	}
	return lava;
    }
    
}
