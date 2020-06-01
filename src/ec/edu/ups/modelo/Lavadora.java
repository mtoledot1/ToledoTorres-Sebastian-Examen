package ec.edu.ups.modelo;
public class Lavadora extends Electrodomestico{
    private int carga;

    public int getCarga() {
	return carga;
    }

    public void setCarga(int carga) {
	this.carga = carga;
    }
    
    public Lavadora(int codigo){
	super(codigo);
    }
    
    public Lavadora(){
	
    }
    
    @Override
    public double obtenerPrecioFinal(){
	double precio = super.obtenerPrecioFinal();
	if(carga > 30){
	    precio += 50;
	}
	return precio;
    }

    @Override
    public String toString() {
	return "\nLavadora:" + 
		super.toString() + 
		"\nCarga: " + carga + 
		"\nPrecio Final: " + obtenerPrecioFinal();
    }
}
