package ec.edu.ups.modelo;
public class Television extends Electrodomestico{
    private int resolucion;
    private boolean puertoHDMI;
    
    public Television(int codigo){
	super(codigo);
    }
    
    public Television(){
	
    }

    public int getResolucion() {
	return resolucion;
    }

    public void setResolucion(int resolucion) {
	this.resolucion = resolucion;
    }

    public boolean isPuertoHDMI() {
	return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
	this.puertoHDMI = puertoHDMI;
    }
    
    @Override
    public double obtenerPrecioFinal(){
	double precio = super.obtenerPrecioFinal();
	if(resolucion > 40){
	    double porcentaje = precio*0.3;
	    precio += porcentaje;
	}
	if(puertoHDMI){
	    precio += 50;
	}
	return precio;
    }

    @Override
    public String toString() {
	String puerto;
	if(puertoHDMI)
	    puerto = "Si";
	else
	    puerto = "No";
	return "\nTelevision:" + 
		super.toString() + 
		"\nResolución: " + resolucion + 
		"\n¿Tiene puerto HDMI?: " + puerto + 
		"\nPrecio Final: " + obtenerPrecioFinal();
    }
    
}
